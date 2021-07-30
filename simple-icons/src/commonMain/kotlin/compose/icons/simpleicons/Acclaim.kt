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

public val SimpleIcons.Acclaim: ImageVector
    get() {
        if (_acclaim != null) {
            return _acclaim!!
        }
        _acclaim = Builder(name = "Acclaim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.468f, 0.186f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.95f, 0.0f)
                lineTo(1.924f, 9.193f)
                arcToRelative(1.705f, 1.705f, 0.0f, false, false, -0.475f, 1.095f)
                verticalLineToRelative(3.59f)
                curveToRelative(0.0f, 0.358f, 0.214f, 0.452f, 0.475f, 0.207f)
                lineToRelative(9.601f, -9.01f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, true, 0.95f, 0.0f)
                lineToRelative(9.603f, 9.01f)
                curveToRelative(0.262f, 0.245f, 0.475f, 0.151f, 0.475f, -0.207f)
                verticalLineToRelative(-3.59f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -0.475f, -1.095f)
                close()
                moveTo(12.468f, 9.969f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, false, -0.95f, 0.0f)
                lineToRelative(-9.595f, 9.002f)
                arcToRelative(1.705f, 1.705f, 0.0f, false, false, -0.475f, 1.094f)
                verticalLineToRelative(3.59f)
                curveToRelative(0.0f, 0.358f, 0.214f, 0.453f, 0.475f, 0.208f)
                lineToRelative(9.601f, -9.007f)
                arcToRelative(0.701f, 0.701f, 0.0f, false, true, 0.95f, 0.0f)
                lineToRelative(9.603f, 9.008f)
                curveToRelative(0.262f, 0.244f, 0.475f, 0.15f, 0.475f, -0.208f)
                verticalLineToRelative(-3.59f)
                arcToRelative(1.71f, 1.71f, 0.0f, false, false, -0.475f, -1.094f)
                close()
            }
        }
        .build()
        return _acclaim!!
    }

private var _acclaim: ImageVector? = null
