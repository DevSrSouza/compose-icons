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

public val MaterialDesignIcons.NetworkStrength4Cog: ImageVector
    get() {
        if (_networkStrength4Cog != null) {
            return _networkStrength4Cog!!
        }
        _networkStrength4Cog = Builder(name = "NetworkStrength4Cog", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                curveTo(16.9f, 13.0f, 16.8f, 13.1f, 16.7f, 13.2f)
                lineTo(16.5f, 14.5f)
                curveTo(16.2f, 14.6f, 15.9f, 14.8f, 15.7f, 15.0f)
                lineTo(14.5f, 14.5f)
                curveTo(14.4f, 14.5f, 14.3f, 14.5f, 14.2f, 14.6f)
                lineTo(13.2f, 16.3f)
                curveTo(13.1f, 16.4f, 13.2f, 16.5f, 13.3f, 16.6f)
                lineTo(14.4f, 17.4f)
                verticalLineTo(18.4f)
                lineTo(13.3f, 19.2f)
                curveTo(13.2f, 19.3f, 13.2f, 19.4f, 13.2f, 19.5f)
                lineTo(14.2f, 21.2f)
                curveTo(14.3f, 21.3f, 14.4f, 21.3f, 14.5f, 21.3f)
                lineTo(15.7f, 20.8f)
                curveTo(16.0f, 21.0f, 16.2f, 21.2f, 16.5f, 21.3f)
                lineTo(16.7f, 22.6f)
                curveTo(16.7f, 22.7f, 16.8f, 22.8f, 17.0f, 22.8f)
                horizontalLineTo(19.0f)
                curveTo(19.1f, 22.8f, 19.2f, 22.7f, 19.2f, 22.6f)
                lineTo(19.4f, 21.3f)
                curveTo(19.7f, 21.2f, 20.0f, 21.0f, 20.2f, 20.8f)
                lineTo(21.4f, 21.3f)
                curveTo(21.5f, 21.3f, 21.7f, 21.3f, 21.7f, 21.2f)
                lineTo(22.7f, 19.5f)
                curveTo(22.8f, 19.4f, 22.7f, 19.3f, 22.6f, 19.2f)
                lineTo(21.5f, 18.4f)
                verticalLineTo(17.9f)
                verticalLineTo(17.4f)
                lineTo(22.6f, 16.6f)
                curveTo(22.7f, 16.5f, 22.7f, 16.4f, 22.7f, 16.3f)
                lineTo(21.7f, 14.6f)
                curveTo(21.6f, 14.5f, 21.5f, 14.5f, 21.4f, 14.5f)
                lineTo(20.3f, 15.0f)
                curveTo(20.0f, 14.8f, 19.8f, 14.6f, 19.4f, 14.5f)
                lineTo(19.2f, 13.2f)
                curveTo(19.2f, 13.1f, 19.1f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(17.0f)
                moveTo(18.0f, 16.5f)
                curveTo(18.8f, 16.5f, 19.5f, 17.2f, 19.5f, 18.0f)
                reflectiveCurveTo(18.8f, 19.5f, 18.0f, 19.5f)
                curveTo(17.2f, 19.5f, 16.5f, 18.8f, 16.5f, 18.0f)
                reflectiveCurveTo(17.2f, 16.5f, 18.0f, 16.5f)
                moveTo(11.7f, 21.0f)
                horizontalLineTo(1.0f)
                lineTo(21.0f, 1.0f)
                verticalLineTo(11.7f)
                curveTo(20.1f, 11.3f, 19.1f, 11.0f, 18.0f, 11.0f)
                curveTo(14.1f, 11.0f, 11.0f, 14.1f, 11.0f, 18.0f)
                curveTo(11.0f, 19.1f, 11.2f, 20.1f, 11.7f, 21.0f)
                close()
            }
        }
        .build()
        return _networkStrength4Cog!!
    }

private var _networkStrength4Cog: ImageVector? = null
