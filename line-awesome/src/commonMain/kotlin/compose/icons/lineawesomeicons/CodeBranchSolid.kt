package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CodeBranchSolid: ImageVector
    get() {
        if (_codeBranchSolid != null) {
            return _codeBranchSolid!!
        }
        _codeBranchSolid = Builder(name = "CodeBranchSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                curveTo(9.3555f, 4.0f, 8.0f, 5.3555f, 8.0f, 7.0f)
                curveTo(8.0f, 8.293f, 8.8438f, 9.3945f, 10.0f, 9.8125f)
                lineTo(10.0f, 22.1875f)
                curveTo(8.8438f, 22.6055f, 8.0f, 23.707f, 8.0f, 25.0f)
                curveTo(8.0f, 26.6445f, 9.3555f, 28.0f, 11.0f, 28.0f)
                curveTo(12.6445f, 28.0f, 14.0f, 26.6445f, 14.0f, 25.0f)
                curveTo(14.0f, 23.7305f, 13.1836f, 22.6563f, 12.0625f, 22.2188f)
                curveTo(12.207f, 20.9883f, 12.6836f, 20.3828f, 13.4375f, 19.875f)
                curveTo(14.3359f, 19.2695f, 15.7148f, 18.9102f, 17.2188f, 18.5625f)
                curveTo(18.7227f, 18.2148f, 20.3359f, 17.8555f, 21.6875f, 16.9063f)
                curveTo(22.875f, 16.0742f, 23.7734f, 14.7109f, 23.9688f, 12.8125f)
                curveTo(25.1406f, 12.4023f, 26.0f, 11.3008f, 26.0f, 10.0f)
                curveTo(26.0f, 8.3555f, 24.6445f, 7.0f, 23.0f, 7.0f)
                curveTo(21.3555f, 7.0f, 20.0f, 8.3555f, 20.0f, 10.0f)
                curveTo(20.0f, 11.2773f, 20.832f, 12.3516f, 21.9688f, 12.7813f)
                curveTo(21.832f, 14.0938f, 21.3242f, 14.7461f, 20.5625f, 15.2813f)
                curveTo(19.6641f, 15.9102f, 18.2773f, 16.2813f, 16.7813f, 16.625f)
                curveTo(15.2852f, 16.9688f, 13.6641f, 17.2734f, 12.3125f, 18.1875f)
                curveTo(12.2031f, 18.2617f, 12.1016f, 18.3555f, 12.0f, 18.4375f)
                lineTo(12.0f, 9.8125f)
                curveTo(13.1563f, 9.3945f, 14.0f, 8.293f, 14.0f, 7.0f)
                curveTo(14.0f, 5.3555f, 12.6445f, 4.0f, 11.0f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                curveTo(11.5625f, 6.0f, 12.0f, 6.4375f, 12.0f, 7.0f)
                curveTo(12.0f, 7.5625f, 11.5625f, 8.0f, 11.0f, 8.0f)
                curveTo(10.4375f, 8.0f, 10.0f, 7.5625f, 10.0f, 7.0f)
                curveTo(10.0f, 6.4375f, 10.4375f, 6.0f, 11.0f, 6.0f)
                close()
                moveTo(23.0f, 9.0f)
                curveTo(23.5625f, 9.0f, 24.0f, 9.4375f, 24.0f, 10.0f)
                curveTo(24.0f, 10.5625f, 23.5625f, 11.0f, 23.0f, 11.0f)
                curveTo(22.4375f, 11.0f, 22.0f, 10.5625f, 22.0f, 10.0f)
                curveTo(22.0f, 9.4375f, 22.4375f, 9.0f, 23.0f, 9.0f)
                close()
                moveTo(11.0f, 24.0f)
                curveTo(11.5625f, 24.0f, 12.0f, 24.4375f, 12.0f, 25.0f)
                curveTo(12.0f, 25.5625f, 11.5625f, 26.0f, 11.0f, 26.0f)
                curveTo(10.4375f, 26.0f, 10.0f, 25.5625f, 10.0f, 25.0f)
                curveTo(10.0f, 24.4375f, 10.4375f, 24.0f, 11.0f, 24.0f)
                close()
            }
        }
        .build()
        return _codeBranchSolid!!
    }

private var _codeBranchSolid: ImageVector? = null
