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

public val SimpleIcons.Vodafone: ImageVector
    get() {
        if (_vodafone != null) {
            return _vodafone!!
        }
        _vodafone = Builder(name = "Vodafone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                moveTo(16.25f, 1.12f)
                curveTo(16.57f, 1.12f, 16.9f, 1.15f, 17.11f, 1.22f)
                curveTo(14.94f, 1.67f, 13.21f, 3.69f, 13.22f, 6.0f)
                curveTo(13.22f, 6.05f, 13.22f, 6.11f, 13.23f, 6.17f)
                curveTo(16.87f, 7.06f, 18.5f, 9.25f, 18.5f, 12.28f)
                curveTo(18.54f, 15.31f, 16.14f, 18.64f, 12.09f, 18.65f)
                curveTo(8.82f, 18.66f, 5.41f, 15.86f, 5.39f, 11.37f)
                curveTo(5.38f, 8.4f, 7.0f, 5.54f, 9.04f, 3.85f)
                curveTo(11.04f, 2.19f, 13.77f, 1.13f, 16.25f, 1.12f)
                close()
            }
        }
        .build()
        return _vodafone!!
    }

private var _vodafone: ImageVector? = null
