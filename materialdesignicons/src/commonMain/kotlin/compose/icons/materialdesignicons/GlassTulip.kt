package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.GlassTulip: ImageVector
    get() {
        if (_glassTulip != null) {
            return _glassTulip!!
        }
        _glassTulip = Builder(name = "GlassTulip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(15.67f, 2.67f, 15.33f, 3.33f, 15.58f, 5.0f)
                curveTo(15.83f, 6.67f, 16.67f, 9.33f, 16.25f, 10.74f)
                curveTo(15.83f, 12.14f, 14.17f, 12.28f, 13.33f, 13.86f)
                curveTo(12.5f, 15.44f, 12.5f, 18.47f, 13.08f, 19.9f)
                curveTo(13.67f, 21.33f, 14.83f, 21.17f, 15.42f, 21.25f)
                curveTo(16.0f, 21.33f, 16.0f, 21.67f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 21.67f, 8.0f, 21.33f, 8.58f, 21.25f)
                curveTo(9.17f, 21.17f, 10.33f, 21.33f, 10.92f, 19.9f)
                curveTo(11.5f, 18.47f, 11.5f, 15.44f, 10.67f, 13.86f)
                curveTo(9.83f, 12.28f, 8.17f, 12.14f, 7.75f, 10.74f)
                curveTo(7.33f, 9.33f, 8.17f, 6.67f, 8.42f, 5.0f)
                curveTo(8.67f, 3.33f, 8.33f, 2.67f, 8.0f, 2.0f)
                moveTo(10.0f, 4.0f)
                curveTo(10.0f, 5.19f, 9.83f, 6.17f, 9.64f, 7.0f)
                horizontalLineTo(14.27f)
                curveTo(14.13f, 6.17f, 14.0f, 5.19f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _glassTulip!!
    }

private var _glassTulip: ImageVector? = null
