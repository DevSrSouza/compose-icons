package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bastyon: ImageVector
    get() {
        if (_bastyon != null) {
            return _bastyon!!
        }
        _bastyon = Builder(name = "Bastyon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.333f, 19.849f)
                arcToRelative(5.439f, 5.439f, 0.0f, false, false, -6.5f, -0.829f)
                arcToRelative(7.914f, 7.914f, 0.0f, false, true, -3.837f, 0.987f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 5.0f, 15.91f)
                arcToRelative(5.473f, 5.473f, 0.0f, false, true, -0.037f, 5.359f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 12.671f, 0.9f)
                arcToRelative(1.825f, 1.825f, 0.0f, false, true, 2.188f, 0.3f)
                lineTo(21.356f, 24.0f)
                lineToRelative(2.562f, -2.568f)
                close()
                moveTo(20.237f, 20.253f)
                arcToRelative(11.664f, 11.664f, 0.0f, false, false, 1.931f, -13.89f)
                arcToRelative(1.836f, 1.836f, 0.0f, false, true, 0.3f, -2.193f)
                lineTo(24.0f, 2.635f)
                lineTo(21.438f, 0.067f)
                lineToRelative(-1.58f, 1.589f)
                arcToRelative(5.471f, 5.471f, 0.0f, false, false, -0.827f, 6.516f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 15.916f, 19.0f)
                lineToRelative(2.086f, 3.0f)
                curveToRelative(0.917f, -0.51f, 1.471f, -0.981f, 2.235f, -1.747f)
                close()
                moveTo(20.232f, 3.772f)
                arcTo(11.6f, 11.6f, 0.0f, false, false, 6.373f, 1.836f)
                arcToRelative(1.816f, 1.816f, 0.0f, false, true, -0.9f, 0.235f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, -1.291f, -0.536f)
                lineTo(2.654f, 0.0f)
                lineTo(0.091f, 2.568f)
                lineToRelative(1.586f, 1.583f)
                arcTo(5.422f, 5.422f, 0.0f, false, false, 5.476f, 5.7f)
                arcToRelative(5.412f, 5.412f, 0.0f, false, false, 2.7f, -0.718f)
                arcTo(7.961f, 7.961f, 0.0f, false, true, 18.985f, 8.1f)
                lineToRelative(3.083f, -1.94f)
                arcToRelative(10.462f, 10.462f, 0.0f, false, false, -1.836f, -2.388f)
                close()
                moveTo(5.0f, 15.909f)
                lineToRelative(-0.034f, -0.062f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.084f, 5.015f)
                lineToRelative(-2.023f, -3.03f)
                curveTo(5.144f, 2.5f, 4.527f, 3.0f, 3.763f, 3.766f)
                arcToRelative(11.664f, 11.664f, 0.0f, false, false, -1.931f, 13.89f)
                arcToRelative(1.836f, 1.836f, 0.0f, false, true, -0.3f, 2.193f)
                lineTo(0.0f, 21.384f)
                lineToRelative(2.562f, 2.568f)
                lineToRelative(1.579f, -1.589f)
                arcToRelative(5.477f, 5.477f, 0.0f, false, false, 0.824f, -1.094f)
                arcTo(5.473f, 5.473f, 0.0f, false, false, 5.0f, 15.909f)
                close()
            }
        }
        .build()
        return _bastyon!!
    }

private var _bastyon: ImageVector? = null
