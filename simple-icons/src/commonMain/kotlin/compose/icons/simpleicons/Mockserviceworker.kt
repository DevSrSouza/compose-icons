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

public val SimpleIcons.Mockserviceworker: ImageVector
    get() {
        if (_mockserviceworker != null) {
            return _mockserviceworker!!
        }
        _mockserviceworker = Builder(name = "Mockserviceworker", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 0.0f)
                arcTo(4.49f, 4.49f, 0.0f, false, false, 0.0f, 4.5f)
                verticalLineToRelative(15.0f)
                arcTo(4.49f, 4.49f, 0.0f, false, false, 4.5f, 24.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(4.49f, 4.49f, 0.0f, false, false, 4.5f, -4.5f)
                verticalLineToRelative(-15.0f)
                arcTo(4.49f, 4.49f, 0.0f, false, false, 19.5f, 0.0f)
                close()
                moveTo(6.133f, 4.43f)
                lineTo(17.848f, 4.443f)
                curveToRelative(0.623f, 0.001f, 1.208f, 0.26f, 1.62f, 0.674f)
                curveToRelative(0.414f, 0.414f, 0.671f, 1.0f, 0.67f, 1.623f)
                verticalLineToRelative(0.086f)
                lineToRelative(-1.224f, 11.799f)
                arcToRelative(2.31f, 2.31f, 0.0f, false, true, -0.836f, 1.545f)
                arcToRelative(2.293f, 2.293f, 0.0f, false, true, -3.15f, -0.246f)
                lineTo(4.426f, 8.262f)
                arcToRelative(2.31f, 2.31f, 0.0f, false, true, -0.586f, -1.657f)
                arcTo(2.295f, 2.295f, 0.0f, false, true, 6.133f, 4.43f)
                close()
                moveTo(8.496f, 7.78f)
                lineTo(15.83f, 15.926f)
                lineTo(16.674f, 7.789f)
                close()
                moveTo(9.619f, 8.281f)
                lineTo(12.863f, 8.285f)
                lineTo(15.783f, 11.529f)
                lineTo(15.447f, 14.756f)
                close()
                moveTo(4.678f, 9.287f)
                lineToRelative(3.017f, 3.354f)
                lineToRelative(-0.369f, 3.57f)
                lineToRelative(3.588f, 0.004f)
                lineToRelative(3.018f, 3.351f)
                lineToRelative(-7.78f, -0.01f)
                curveToRelative(-0.623f, 0.0f, -1.208f, -0.26f, -1.62f, -0.673f)
                curveToRelative(-0.414f, -0.414f, -0.671f, -1.0f, -0.67f, -1.623f)
                verticalLineToRelative(-0.086f)
                close()
            }
        }
        .build()
        return _mockserviceworker!!
    }

private var _mockserviceworker: ImageVector? = null
