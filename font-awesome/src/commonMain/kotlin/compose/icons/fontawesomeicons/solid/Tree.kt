package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(378.31f, 378.49f)
                lineTo(298.42f, 288.0f)
                horizontalLineToRelative(30.63f)
                curveToRelative(9.01f, 0.0f, 16.98f, -5.0f, 20.78f, -13.06f)
                curveToRelative(3.8f, -8.04f, 2.55f, -17.26f, -3.28f, -24.05f)
                lineTo(268.42f, 160.0f)
                horizontalLineToRelative(28.89f)
                curveToRelative(9.1f, 0.0f, 17.3f, -5.35f, 20.86f, -13.61f)
                curveToRelative(3.52f, -8.13f, 1.86f, -17.59f, -4.24f, -24.08f)
                lineTo(203.66f, 4.83f)
                curveToRelative(-6.03f, -6.45f, -17.28f, -6.45f, -23.32f, 0.0f)
                lineTo(70.06f, 122.31f)
                curveToRelative(-6.1f, 6.49f, -7.75f, 15.95f, -4.24f, 24.08f)
                curveTo(69.38f, 154.65f, 77.59f, 160.0f, 86.69f, 160.0f)
                horizontalLineToRelative(28.89f)
                lineToRelative(-78.14f, 90.91f)
                curveToRelative(-5.81f, 6.78f, -7.06f, 15.99f, -3.27f, 24.04f)
                curveTo(37.97f, 283.0f, 45.93f, 288.0f, 54.95f, 288.0f)
                horizontalLineToRelative(30.63f)
                lineTo(5.69f, 378.49f)
                curveToRelative(-6.0f, 6.79f, -7.36f, 16.09f, -3.56f, 24.26f)
                curveToRelative(3.75f, 8.05f, 12.0f, 13.25f, 21.01f, 13.25f)
                horizontalLineTo(160.0f)
                verticalLineToRelative(24.45f)
                lineToRelative(-30.29f, 48.4f)
                curveToRelative(-5.32f, 10.64f, 2.42f, 23.16f, 14.31f, 23.16f)
                horizontalLineToRelative(95.96f)
                curveToRelative(11.89f, 0.0f, 19.63f, -12.52f, 14.31f, -23.16f)
                lineTo(224.0f, 440.45f)
                verticalLineTo(416.0f)
                horizontalLineToRelative(136.86f)
                curveToRelative(9.01f, 0.0f, 17.26f, -5.2f, 21.01f, -13.25f)
                curveToRelative(3.8f, -8.17f, 2.44f, -17.47f, -3.56f, -24.26f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
