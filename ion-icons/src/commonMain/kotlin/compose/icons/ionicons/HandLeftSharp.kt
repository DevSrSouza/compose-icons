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

public val IonIcons.HandLeftSharp: ImageVector
    get() {
        if (_handLeftSharp != null) {
            return _handLeftSharp!!
        }
        _handLeftSharp = Builder(name = "HandLeftSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(429.58f, 209.08f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-15.06f, -6.62f, -32.38f, 1.31f, -38.5f, 17.62f)
                lineTo(356.0f, 312.0f)
                horizontalLineTo(344.73f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -17.6f, -13.3f, -32.0f, -29.55f, -32.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-16.26f, 0.0f, -29.55f, 14.4f, -29.55f, 32.0f)
                verticalLineTo(231.75f)
                lineToRelative(-14.78f, 0.25f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.6f, -13.3f, -32.0f, -29.55f, -32.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-16.25f, 0.0f, -29.55f, 14.4f, -29.55f, 32.0f)
                verticalLineTo(231.75f)
                lineTo(197.0f, 232.0f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.6f, -13.3f, -32.0f, -29.55f, -32.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-16.26f, 0.0f, -29.55f, 14.4f, -29.55f, 32.0f)
                verticalLineTo(247.75f)
                lineTo(123.1f, 248.0f)
                verticalLineTo(128.0f)
                curveToRelative(0.0f, -17.6f, -13.3f, -32.0f, -29.55f, -32.0f)
                horizontalLineToRelative(0.0f)
                curveTo(77.3f, 96.0f, 64.0f, 110.4f, 64.0f, 128.0f)
                verticalLineTo(344.0f)
                curveToRelative(0.0f, 75.8f, 37.13f, 168.0f, 169.0f, 168.0f)
                curveToRelative(40.8f, 0.0f, 79.42f, -7.0f, 100.66f, -21.0f)
                arcToRelative(121.41f, 121.41f, 0.0f, false, false, 33.72f, -33.31f)
                arcToRelative(138.0f, 138.0f, 0.0f, false, false, 16.0f, -31.78f)
                lineToRelative(62.45f, -175.14f)
                curveTo(452.0f, 234.46f, 444.64f, 215.71f, 429.58f, 209.08f)
                close()
            }
        }
        .build()
        return _handLeftSharp!!
    }

private var _handLeftSharp: ImageVector? = null
