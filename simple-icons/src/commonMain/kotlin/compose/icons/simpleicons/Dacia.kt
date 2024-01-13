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

public val SimpleIcons.Dacia: ImageVector
    get() {
        if (_dacia != null) {
            return _dacia!!
        }
        _dacia = Builder(name = "Dacia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.646f)
                verticalLineToRelative(2.23f)
                horizontalLineToRelative(8.252f)
                verticalLineToRelative(2.248f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.23f)
                horizontalLineToRelative(9.112f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, 0.489f, -0.201f)
                lineTo(12.0f, 12.819f)
                lineToRelative(2.399f, 2.334f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, 0.49f, 0.201f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-2.23f)
                horizontalLineToRelative(-8.252f)
                verticalLineToRelative(-2.248f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-2.23f)
                horizontalLineToRelative(-9.112f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, -0.489f, 0.201f)
                lineTo(12.0f, 11.181f)
                lineTo(9.601f, 8.847f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, -0.49f, -0.201f)
                close()
            }
        }
        .build()
        return _dacia!!
    }

private var _dacia: ImageVector? = null
