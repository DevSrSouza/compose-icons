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

public val RemixIcons.StackshareFill: ImageVector
    get() {
        if (_stackshareFill != null) {
            return _stackshareFill!!
        }
        _stackshareFill = Builder(name = "StackshareFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(16.792f, 5.621f)
                curveToRelative(-1.011f, 0.0f, -1.864f, 0.676f, -2.133f, 1.6f)
                horizontalLineToRelative(-1.998f)
                lineToRelative(-2.46f, 4.185f)
                lineTo(8.763f, 11.406f)
                curveToRelative(-0.268f, -0.925f, -1.121f, -1.6f, -2.133f, -1.6f)
                curveToRelative(-1.226f, 0.0f, -2.221f, 0.994f, -2.221f, 2.22f)
                curveToRelative(0.0f, 1.228f, 0.995f, 2.222f, 2.221f, 2.222f)
                curveToRelative(1.012f, 0.0f, 1.865f, -0.676f, 2.133f, -1.6f)
                horizontalLineToRelative(1.471f)
                lineToRelative(2.417f, 4.133f)
                horizontalLineToRelative(2.018f)
                curveToRelative(0.268f, 0.925f, 1.121f, 1.6f, 2.132f, 1.6f)
                curveToRelative(1.227f, 0.0f, 2.222f, -0.994f, 2.222f, -2.221f)
                reflectiveCurveToRelative(-0.995f, -2.222f, -2.222f, -2.222f)
                curveToRelative(-1.01f, 0.0f, -1.864f, 0.676f, -2.132f, 1.6f)
                horizontalLineToRelative(-1.317f)
                lineToRelative(-2.056f, -3.536f)
                lineToRelative(2.053f, -3.538f)
                horizontalLineToRelative(1.31f)
                curveToRelative(0.27f, 0.925f, 1.122f, 1.6f, 2.133f, 1.6f)
                curveToRelative(1.227f, 0.0f, 2.222f, -0.994f, 2.222f, -2.221f)
                reflectiveCurveToRelative(-0.995f, -2.222f, -2.222f, -2.222f)
                close()
                moveTo(16.803f, 15.048f)
                curveToRelative(0.644f, 0.0f, 1.168f, 0.524f, 1.168f, 1.168f)
                curveToRelative(0.0f, 0.644f, -0.524f, 1.167f, -1.168f, 1.167f)
                curveToRelative(-0.566f, 0.0f, -1.038f, -0.405f, -1.144f, -0.94f)
                curveToRelative(0.0f, 0.0f, -0.031f, -0.227f, 0.0f, -0.454f)
                curveToRelative(0.106f, -0.535f, 0.578f, -0.94f, 1.144f, -0.94f)
                close()
                moveTo(6.651f, 10.838f)
                curveToRelative(0.644f, 0.0f, 1.168f, 0.524f, 1.168f, 1.168f)
                curveToRelative(0.0f, 0.643f, -0.524f, 1.167f, -1.168f, 1.167f)
                curveToRelative(-0.644f, 0.0f, -1.167f, -0.524f, -1.167f, -1.167f)
                curveToRelative(0.0f, -0.644f, 0.523f, -1.167f, 1.167f, -1.167f)
                close()
                moveTo(16.801f, 6.629f)
                curveToRelative(0.644f, 0.0f, 1.168f, 0.523f, 1.168f, 1.167f)
                reflectiveCurveToRelative(-0.524f, 1.168f, -1.168f, 1.168f)
                curveToRelative(-0.565f, 0.0f, -1.038f, -0.406f, -1.144f, -0.941f)
                curveToRelative(-0.026f, -0.206f, 0.0f, -0.446f, 0.0f, -0.446f)
                curveToRelative(0.106f, -0.543f, 0.579f, -0.948f, 1.144f, -0.948f)
                close()
            }
        }
        .build()
        return _stackshareFill!!
    }

private var _stackshareFill: ImageVector? = null
