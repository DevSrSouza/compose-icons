package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Houzz: ImageVector
    get() {
        if (_houzz != null) {
            return _houzz!!
        }
        _houzz = Builder(name = "Houzz", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(275.9f, 330.7f)
                horizontalLineTo(171.3f)
                verticalLineTo(480.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(32.0f)
                horizontalLineToRelative(109.5f)
                verticalLineToRelative(104.5f)
                lineToRelative(305.1f, 85.6f)
                verticalLineTo(480.0f)
                horizontalLineTo(275.9f)
                close()
            }
        }
        .build()
        return _houzz!!
    }

private var _houzz: ImageVector? = null
