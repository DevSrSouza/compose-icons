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

public val SimpleIcons.Houzz: ImageVector
    get() {
        if (_houzz != null) {
            return _houzz!!
        }
        _houzz = Builder(name = "Houzz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.27f, 0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(9.32f)
                verticalLineTo(16.44f)
                horizontalLineTo(14.68f)
                verticalLineTo(24.0f)
                horizontalLineTo(22.73f)
                verticalLineTo(10.37f)
                lineTo(6.61f, 5.75f)
                verticalLineTo(0.0f)
                horizontalLineTo(1.27f)
                close()
            }
        }
        .build()
        return _houzz!!
    }

private var _houzz: ImageVector? = null
