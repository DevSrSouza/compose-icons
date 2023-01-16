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

public val MaterialDesignIcons.BoneOff: ImageVector
    get() {
        if (_boneOff != null) {
            return _boneOff!!
        }
        _boneOff = Builder(name = "BoneOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(5.1f, 7.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3f, 7.0f, 2.0f, 8.3f, 2.0f, 10.0f)
                curveTo(2.0f, 10.8f, 2.3f, 11.5f, 2.8f, 12.0f)
                curveTo(2.3f, 12.5f, 2.0f, 13.2f, 2.0f, 14.0f)
                curveTo(2.0f, 15.7f, 3.3f, 17.0f, 5.0f, 17.0f)
                reflectiveCurveTo(8.0f, 15.7f, 8.0f, 14.0f)
                curveTo(9.3f, 13.9f, 10.6f, 13.8f, 11.9f, 13.8f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(20.0f, 16.8f)
                lineTo(13.3f, 10.1f)
                curveTo(14.2f, 10.1f, 15.1f, 10.0f, 16.0f, 10.0f)
                curveTo(16.0f, 8.3f, 17.3f, 7.0f, 19.0f, 7.0f)
                reflectiveCurveTo(22.0f, 8.3f, 22.0f, 10.0f)
                curveTo(22.0f, 10.8f, 21.7f, 11.5f, 21.2f, 12.0f)
                curveTo(21.7f, 12.5f, 22.0f, 13.2f, 22.0f, 14.0f)
                curveTo(22.0f, 15.3f, 21.2f, 16.4f, 20.0f, 16.8f)
                close()
            }
        }
        .build()
        return _boneOff!!
    }

private var _boneOff: ImageVector? = null
