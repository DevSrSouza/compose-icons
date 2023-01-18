package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SkypeLine: ImageVector
    get() {
        if (_skypeLine != null) {
            return _skypeLine!!
        }
        _skypeLine = Builder(name = "SkypeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.004f, 18.423f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.237f, 0.207f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 4.389f, -4.389f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.207f, -1.237f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -7.427f, -7.427f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.237f, -0.207f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 5.37f, 9.76f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.207f, 1.237f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 7.427f, 7.427f)
                close()
                moveTo(12.0f, 20.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -8.4f, -9.81f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, 7.09f, -7.09f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 9.71f, 9.71f)
                arcToRelative(5.25f, 5.25f, 0.0f, false, true, -7.09f, 7.09f)
                curveToRelative(-0.427f, 0.066f, -0.865f, 0.1f, -1.31f, 0.1f)
                close()
                moveTo(12.053f, 17.0f)
                curveTo(9.25f, 17.0f, 8.0f, 15.62f, 8.0f, 14.586f)
                curveToRelative(0.0f, -0.532f, 0.39f, -0.902f, 0.928f, -0.902f)
                curveToRelative(1.2f, 0.0f, 0.887f, 1.725f, 3.125f, 1.725f)
                curveToRelative(1.143f, 0.0f, 1.776f, -0.624f, 1.776f, -1.261f)
                curveToRelative(0.0f, -0.384f, -0.188f, -0.808f, -0.943f, -0.996f)
                lineToRelative(-2.49f, -0.623f)
                curveToRelative(-2.006f, -0.504f, -2.37f, -1.592f, -2.37f, -2.612f)
                curveTo(8.026f, 7.797f, 10.018f, 7.0f, 11.89f, 7.0f)
                curveToRelative(1.72f, 0.0f, 3.756f, 0.956f, 3.756f, 2.228f)
                curveToRelative(0.0f, 0.545f, -0.48f, 0.863f, -1.012f, 0.863f)
                curveToRelative(-1.023f, 0.0f, -0.835f, -1.418f, -2.9f, -1.418f)
                curveToRelative(-1.023f, 0.0f, -1.596f, 0.462f, -1.596f, 1.126f)
                curveToRelative(0.0f, 0.663f, 0.803f, 0.876f, 1.502f, 1.035f)
                lineToRelative(1.836f, 0.409f)
                curveTo(15.49f, 11.695f, 16.0f, 12.876f, 16.0f, 13.989f)
                curveTo(16.0f, 15.713f, 14.675f, 17.0f, 12.015f, 17.0f)
                horizontalLineToRelative(0.038f)
                close()
            }
        }
        .build()
        return _skypeLine!!
    }

private var _skypeLine: ImageVector? = null
