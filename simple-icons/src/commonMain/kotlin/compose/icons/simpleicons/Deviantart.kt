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

public val SimpleIcons.Deviantart: ImageVector
    get() {
        if (_deviantart != null) {
            return _deviantart!!
        }
        _deviantart = Builder(name = "Deviantart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.207f, 4.794f)
                lineToRelative(0.23f, -0.43f)
                verticalLineTo(0.0f)
                horizontalLineTo(15.07f)
                lineToRelative(-0.436f, 0.44f)
                lineToRelative(-2.058f, 3.925f)
                lineToRelative(-0.646f, 0.436f)
                horizontalLineTo(4.58f)
                verticalLineToRelative(5.993f)
                horizontalLineToRelative(4.04f)
                lineToRelative(0.36f, 0.436f)
                lineToRelative(-4.175f, 7.98f)
                lineToRelative(-0.24f, 0.43f)
                verticalLineTo(24.0f)
                horizontalLineTo(8.93f)
                lineToRelative(0.436f, -0.44f)
                lineToRelative(2.07f, -3.925f)
                lineToRelative(0.644f, -0.436f)
                horizontalLineToRelative(7.35f)
                verticalLineToRelative(-5.993f)
                horizontalLineToRelative(-4.05f)
                lineToRelative(-0.36f, -0.438f)
                lineToRelative(4.186f, -7.977f)
                close()
            }
        }
        .build()
        return _deviantart!!
    }

private var _deviantart: ImageVector? = null
