package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PlaySkipBackCircleOutline: ImageVector
    get() {
        if (_playSkipBackCircleOutline != null) {
            return _playSkipBackCircleOutline!!
        }
        _playSkipBackCircleOutline = Builder(name = "PlaySkipBackCircleOutline", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 448.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, -86.0f, 192.0f, -192.0f)
                reflectiveCurveTo(362.0f, 64.0f, 256.0f, 64.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveTo(150.0f, 448.0f, 256.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(53.0f)
                lineToRelative(111.68f, -67.46f)
                arcTo(10.78f, 10.78f, 0.0f, false, true, 336.0f, 186.87f)
                verticalLineTo(325.13f)
                arcToRelative(10.78f, 10.78f, 0.0f, false, true, -16.32f, 9.31f)
                lineTo(208.0f, 267.0f)
                verticalLineToRelative(53.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                verticalLineTo(192.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 176.0f)
                close()
            }
        }
        .build()
        return _playSkipBackCircleOutline!!
    }

private var _playSkipBackCircleOutline: ImageVector? = null
