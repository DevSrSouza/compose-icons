package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CafeOutline: ImageVector
    get() {
        if (_cafeOutline != null) {
            return _cafeOutline!!
        }
        _cafeOutline = Builder(name = "CafeOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(368.0f, 80.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, -46.0f, 46.0f)
                horizontalLineTo(368.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 80.0f)
                horizontalLineTo(368.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.0f, 0.0f)
                verticalLineTo(272.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, 80.0f)
                horizontalLineTo(176.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, -80.0f)
                verticalLineTo(80.0f)
                arcTo(0.0f, 0.0f, 0.0f, false, true, 96.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.0f, 416.0f)
                lineTo(400.0f, 416.0f)
            }
        }
        .build()
        return _cafeOutline!!
    }

private var _cafeOutline: ImageVector? = null
