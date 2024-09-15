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

public val SimpleIcons.Treehouse: ImageVector
    get() {
        if (_treehouse != null) {
            return _treehouse!!
        }
        _treehouse = Builder(name = "Treehouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.398f, 4.386f)
                curveToRelative(-0.821f, -0.448f, -2.09f, 0.299f, -2.837f, 1.642f)
                lineToRelative(-1.418f, 2.389f)
                curveToRelative(-0.523f, 0.97f, -0.448f, 2.165f, 0.224f, 3.135f)
                lineToRelative(0.075f, 0.075f)
                curveToRelative(0.672f, 0.896f, 1.493f, 1.792f, 1.792f, 2.09f)
                curveToRelative(0.149f, 0.149f, 0.299f, 0.373f, 0.373f, 0.672f)
                curveToRelative(0.224f, 0.821f, -0.224f, 1.717f, -1.12f, 1.941f)
                curveToRelative(-0.821f, 0.224f, -1.717f, -0.224f, -1.941f, -1.12f)
                curveToRelative(-0.075f, -0.224f, -0.075f, -0.448f, -0.075f, -0.597f)
                curveToRelative(0.075f, -0.373f, -0.075f, -0.896f, -0.597f, -1.493f)
                curveToRelative(-0.522f, -0.523f, -1.493f, 0.522f, -1.866f, 1.568f)
                verticalLineToRelative(0.075f)
                curveToRelative(-0.299f, 1.045f, -0.523f, 2.016f, -0.448f, 2.09f)
                curveToRelative(0.0f, 0.075f, 0.075f, 0.075f, 0.075f, 0.149f)
                curveToRelative(0.448f, 0.896f, 0.149f, 1.941f, -0.747f, 2.389f)
                curveToRelative(-0.896f, 0.448f, -1.941f, 0.149f, -2.389f, -0.747f)
                curveToRelative(-0.448f, -0.896f, -0.149f, -1.941f, 0.747f, -2.389f)
                curveToRelative(0.075f, 0.0f, 0.075f, -0.075f, 0.149f, -0.075f)
                curveToRelative(0.075f, 0.0f, 0.224f, -0.448f, 0.448f, -1.045f)
                curveToRelative(0.149f, -0.522f, 0.224f, -0.747f, 0.299f, -0.97f)
                curveToRelative(0.075f, -0.299f, 0.224f, -1.045f, 0.149f, -1.344f)
                curveToRelative(-0.075f, -0.373f, -0.448f, -0.373f, -0.821f, -0.149f)
                curveToRelative(-0.224f, 0.149f, -0.672f, 0.522f, -0.821f, 0.672f)
                curveToRelative(-0.373f, 0.299f, -0.672f, 0.747f, -0.821f, 1.12f)
                curveToRelative(-0.075f, 0.149f, -0.224f, 0.373f, -0.373f, 0.522f)
                curveToRelative(-0.672f, 0.523f, -1.642f, 0.448f, -2.24f, -0.224f)
                curveToRelative(-0.522f, -0.672f, -0.448f, -1.642f, 0.224f, -2.239f)
                curveToRelative(0.224f, -0.149f, 0.448f, -0.299f, 0.672f, -0.299f)
                curveToRelative(0.373f, -0.075f, 1.717f, -0.896f, 2.538f, -1.493f)
                curveToRelative(0.149f, -0.075f, 0.373f, -0.299f, 0.448f, -0.373f)
                curveToRelative(0.224f, -0.299f, 0.0f, -0.523f, -0.224f, -0.523f)
                curveToRelative(-0.672f, 0.075f, -1.418f, 0.149f, -1.568f, 0.373f)
                curveToRelative(-0.075f, 0.075f, -0.149f, 0.224f, -0.299f, 0.299f)
                curveToRelative(-0.597f, 0.448f, -1.493f, 0.299f, -1.941f, -0.299f)
                curveToRelative(-0.448f, -0.597f, -0.299f, -1.493f, 0.299f, -1.941f)
                curveToRelative(0.224f, -0.224f, 0.597f, -0.299f, 0.821f, -0.299f)
                curveToRelative(0.522f, 0.0f, 1.866f, 0.299f, 2.911f, 0.075f)
                lineToRelative(0.299f, -0.075f)
                curveToRelative(1.12f, -0.224f, 2.464f, -1.194f, 2.986f, -2.165f)
                curveToRelative(0.0f, 0.0f, 0.523f, -0.896f, 1.12f, -2.016f)
                curveToRelative(0.672f, -1.12f, 0.597f, -2.389f, -0.075f, -2.762f)
                lineToRelative(-1.269f, -0.747f)
                curveToRelative(-0.672f, -0.373f, -1.642f, -0.373f, -2.314f, 0.0f)
                lineTo(2.184f, 5.207f)
                curveTo(1.512f, 5.58f, 0.989f, 6.476f, 0.989f, 7.222f)
                verticalLineToRelative(9.555f)
                curveToRelative(0.0f, 0.747f, 0.523f, 1.642f, 1.194f, 2.016f)
                lineTo(10.843f, 23.72f)
                curveToRelative(0.672f, 0.373f, 1.717f, 0.373f, 2.314f, 0.0f)
                lineToRelative(8.659f, -4.927f)
                curveToRelative(0.672f, -0.373f, 1.194f, -1.269f, 1.194f, -2.016f)
                verticalLineTo(7.222f)
                curveToRelative(0.0f, -0.747f, -0.523f, -1.642f, -1.194f, -2.016f)
                curveToRelative(0.0f, 0.0f, -0.597f, -0.373f, -1.418f, -0.821f)
                close()
            }
        }
        .build()
        return _treehouse!!
    }

private var _treehouse: ImageVector? = null
