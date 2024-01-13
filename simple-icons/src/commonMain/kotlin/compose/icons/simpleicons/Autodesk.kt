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

public val SimpleIcons.Autodesk: ImageVector
    get() {
        if (_autodesk != null) {
            return _autodesk!!
        }
        _autodesk = Builder(name = "Autodesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.129f, 20.202f)
                lineToRelative(14.7f, -9.136f)
                horizontalLineToRelative(7.625f)
                curveToRelative(0.235f, 0.0f, 0.445f, 0.188f, 0.445f, 0.445f)
                curveToRelative(0.0f, 0.21f, -0.092f, 0.305f, -0.21f, 0.375f)
                lineToRelative(-7.222f, 4.323f)
                curveToRelative(-0.47f, 0.283f, -0.633f, 0.845f, -0.633f, 1.265f)
                lineToRelative(-0.008f, 2.725f)
                horizontalLineTo(24.0f)
                verticalLineTo(4.362f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, false, -0.585f, -0.562f)
                horizontalLineToRelative(-8.752f)
                lineTo(0.0f, 12.893f)
                verticalLineTo(20.2f)
                horizontalLineToRelative(0.129f)
                close()
            }
        }
        .build()
        return _autodesk!!
    }

private var _autodesk: ImageVector? = null
