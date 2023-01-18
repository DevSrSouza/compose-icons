package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 74.0f)
                lineTo(176.3f, 74.0f)
                lineToRelative(1.2f, -1.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -42.4f, -42.4f)
                arcTo(33.9f, 33.9f, 0.0f, false, false, 128.0f, 42.2f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, false, -7.1f, -11.7f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 78.5f, 72.9f)
                horizontalLineToRelative(0.0f)
                lineTo(79.7f, 74.0f)
                lineTo(40.0f, 74.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(66.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 134.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(143.6f, 39.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 169.0f, 64.4f)
                curveToRelative(-5.9f, 5.9f, -22.5f, 8.7f, -34.8f, 9.4f)
                curveTo(134.9f, 61.5f, 137.7f, 44.9f, 143.6f, 39.0f)
                close()
                moveTo(87.0f, 39.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 25.4f, 0.0f)
                curveToRelative(5.9f, 5.9f, 8.7f, 22.5f, 9.4f, 34.8f)
                curveToRelative(-12.3f, -0.7f, -28.9f, -3.5f, -34.8f, -9.4f)
                horizontalLineToRelative(0.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 87.0f, 39.0f)
                close()
                moveTo(38.0f, 120.0f)
                lineTo(38.0f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(82.0f)
                verticalLineToRelative(36.0f)
                lineTo(40.0f, 122.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 120.0f)
                close()
                moveTo(54.0f, 200.0f)
                lineTo(54.0f, 134.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(68.0f)
                lineTo(56.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 54.0f, 200.0f)
                close()
                moveTo(202.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(134.0f, 202.0f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(68.0f)
                close()
                moveTo(218.0f, 120.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(134.0f, 122.0f)
                lineTo(134.0f, 86.0f)
                horizontalLineToRelative(82.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
