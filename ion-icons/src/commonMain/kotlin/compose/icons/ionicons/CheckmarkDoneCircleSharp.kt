package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CheckmarkDoneCircleSharp: ImageVector
    get() {
        if (_checkmarkDoneCircleSharp != null) {
            return _checkmarkDoneCircleSharp!!
        }
        _checkmarkDoneCircleSharp = Builder(name = "CheckmarkDoneCircleSharp", defaultWidth =
                512.0.dp, defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight =
                512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(304.19f, 169.42f)
                lineTo(328.29f, 190.48f)
                lineTo(254.68f, 274.58f)
                lineTo(230.58f, 251.52f)
                close()
                moveTo(191.93f, 342.63f)
                lineTo(121.37f, 272.0f)
                lineTo(144.0f, 249.37f)
                lineTo(214.57f, 320.0f)
                close()
                moveTo(256.93f, 343.42f)
                lineTo(185.55f, 272.0f)
                lineToRelative(22.64f, -22.62f)
                lineToRelative(47.16f, 47.21f)
                lineTo(366.48f, 169.42f)
                lineToRelative(24.1f, 21.06f)
                close()
            }
        }
        .build()
        return _checkmarkDoneCircleSharp!!
    }

private var _checkmarkDoneCircleSharp: ImageVector? = null
