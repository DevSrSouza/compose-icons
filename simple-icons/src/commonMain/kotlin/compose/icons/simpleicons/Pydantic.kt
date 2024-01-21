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

public val SimpleIcons.Pydantic: ImageVector
    get() {
        if (_pydantic != null) {
            return _pydantic!!
        }
        _pydantic = Builder(name = "Pydantic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.826f, 17.316f)
                lineToRelative(-4.23f, -5.866f)
                lineToRelative(-6.847f, -9.496f)
                curveToRelative(-0.348f, -0.48f, -1.151f, -0.48f, -1.497f, 0.0f)
                lineToRelative(-6.845f, 9.494f)
                lineToRelative(-4.233f, 5.868f)
                arcToRelative(0.925f, 0.925f, 0.0f, false, false, 0.46f, 1.417f)
                lineToRelative(11.078f, 3.626f)
                horizontalLineToRelative(0.002f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, 0.572f, 0.0f)
                horizontalLineToRelative(0.002f)
                lineToRelative(11.077f, -3.626f)
                curveToRelative(0.28f, -0.092f, 0.5f, -0.31f, 0.59f, -0.592f)
                arcToRelative(0.916f, 0.916f, 0.0f, false, false, -0.13f, -0.825f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(12.001f, 4.07f)
                lineToRelative(4.44f, 6.158f)
                lineToRelative(-4.152f, -1.36f)
                curveToRelative(-0.032f, -0.01f, -0.066f, -0.008f, -0.098f, -0.016f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.096f, -0.016f)
                curveToRelative(-0.032f, -0.004f, -0.062f, -0.016f, -0.094f, -0.016f)
                reflectiveCurveToRelative(-0.062f, 0.012f, -0.094f, 0.016f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, -0.096f, 0.016f)
                curveToRelative(-0.032f, 0.006f, -0.066f, 0.006f, -0.096f, 0.016f)
                lineTo(7.59f, 10.221f)
                lineToRelative(-0.026f, 0.008f)
                lineToRelative(4.44f, -6.158f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(5.728f, 12.77f)
                lineTo(10.562f, 11.187f)
                lineTo(11.078f, 11.019f)
                verticalLineToRelative(9.19f)
                lineTo(2.41f, 17.372f)
                lineToRelative(3.317f, -4.6f)
                close()
                moveTo(12.925f, 20.207f)
                lineTo(12.925f, 11.02f)
                lineToRelative(5.35f, 1.752f)
                lineToRelative(3.316f, 4.598f)
                lineToRelative(-8.666f, 2.838f)
                close()
            }
        }
        .build()
        return _pydantic!!
    }

private var _pydantic: ImageVector? = null
