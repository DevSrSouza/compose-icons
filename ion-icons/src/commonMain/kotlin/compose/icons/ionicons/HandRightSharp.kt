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

public val IonIcons.HandRightSharp: ImageVector
    get() {
        if (_handRightSharp != null) {
            return _handRightSharp!!
        }
        _handRightSharp = Builder(name = "HandRightSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.42f, 209.08f)
                horizontalLineToRelative(0.0f)
                curveToRelative(15.06f, -6.62f, 32.38f, 1.31f, 38.5f, 17.62f)
                lineTo(156.0f, 312.0f)
                horizontalLineToRelative(11.27f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -17.6f, 13.3f, -32.0f, 29.55f, -32.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(16.26f, 0.0f, 29.55f, 14.4f, 29.55f, 32.0f)
                verticalLineTo(231.75f)
                lineToRelative(14.78f, 0.25f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.6f, 13.3f, -32.0f, 29.55f, -32.0f)
                horizontalLineToRelative(0.0f)
                curveTo(287.0f, 0.0f, 300.25f, 14.4f, 300.25f, 32.0f)
                verticalLineTo(231.75f)
                lineTo(315.0f, 232.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.6f, 13.3f, -32.0f, 29.55f, -32.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(16.26f, 0.0f, 29.55f, 14.4f, 29.55f, 32.0f)
                verticalLineTo(247.75f)
                lineToRelative(14.78f, 0.25f)
                verticalLineTo(128.0f)
                curveToRelative(0.0f, -17.6f, 13.3f, -32.0f, 29.55f, -32.0f)
                horizontalLineToRelative(0.0f)
                curveTo(434.7f, 96.0f, 448.0f, 110.4f, 448.0f, 128.0f)
                verticalLineTo(344.0f)
                curveToRelative(0.0f, 75.8f, -37.13f, 168.0f, -169.0f, 168.0f)
                curveToRelative(-40.8f, 0.0f, -79.42f, -7.0f, -100.66f, -21.0f)
                arcToRelative(121.41f, 121.41f, 0.0f, false, true, -33.72f, -33.31f)
                arcToRelative(138.0f, 138.0f, 0.0f, false, true, -16.0f, -31.78f)
                lineTo(66.16f, 250.77f)
                curveTo(60.05f, 234.46f, 67.36f, 215.71f, 82.42f, 209.08f)
                close()
            }
        }
        .build()
        return _handRightSharp!!
    }

private var _handRightSharp: ImageVector? = null
