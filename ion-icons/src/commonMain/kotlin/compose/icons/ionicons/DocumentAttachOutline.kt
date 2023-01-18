package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.DocumentAttachOutline: ImageVector
    get() {
        if (_documentAttachOutline != null) {
            return _documentAttachOutline!!
        }
        _documentAttachOutline = Builder(name = "DocumentAttachOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 64.0f)
                horizontalLineToRelative(66.75f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 22.62f, 9.37f)
                lineTo(438.63f, 214.63f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 448.0f, 237.25f)
                verticalLineTo(432.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f)
                horizontalLineTo(192.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f)
                verticalLineTo(304.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(288.0f, 72.0f)
                verticalLineTo(192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineTo(440.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 80.0f)
                verticalLineTo(232.0f)
                arcToRelative(23.69f, 23.69f, 0.0f, false, true, -24.0f, 24.0f)
                curveToRelative(-12.0f, 0.0f, -24.0f, -9.1f, -24.0f, -24.0f)
                verticalLineTo(88.0f)
                curveToRelative(0.0f, -30.59f, 16.57f, -56.0f, 48.0f, -56.0f)
                reflectiveCurveToRelative(48.0f, 24.8f, 48.0f, 55.38f)
                verticalLineTo(226.13f)
                curveToRelative(0.0f, 43.0f, -27.82f, 77.87f, -72.0f, 77.87f)
                reflectiveCurveToRelative(-72.0f, -34.86f, -72.0f, -77.87f)
                verticalLineTo(144.0f)
            }
        }
        .build()
        return _documentAttachOutline!!
    }

private var _documentAttachOutline: ImageVector? = null
