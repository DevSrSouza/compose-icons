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

public val MaterialDesignIcons.MagicStaff: ImageVector
    get() {
        if (_magicStaff != null) {
            return _magicStaff!!
        }
        _magicStaff = Builder(name = "MagicStaff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 9.0f)
                curveTo(16.12f, 9.0f, 15.0f, 7.88f, 15.0f, 6.5f)
                reflectiveCurveTo(16.12f, 4.0f, 17.5f, 4.0f)
                reflectiveCurveTo(20.0f, 5.12f, 20.0f, 6.5f)
                reflectiveCurveTo(18.88f, 9.0f, 17.5f, 9.0f)
                moveTo(14.43f, 8.15f)
                lineTo(2.0f, 20.59f)
                lineTo(3.41f, 22.0f)
                lineTo(15.85f, 9.57f)
                curveTo(15.25f, 9.24f, 14.76f, 8.75f, 14.43f, 8.15f)
                moveTo(13.0f, 5.0f)
                lineTo(13.63f, 3.63f)
                lineTo(15.0f, 3.0f)
                lineTo(13.63f, 2.37f)
                lineTo(13.0f, 1.0f)
                lineTo(12.38f, 2.37f)
                lineTo(11.0f, 3.0f)
                lineTo(12.38f, 3.63f)
                lineTo(13.0f, 5.0f)
                moveTo(21.0f, 5.0f)
                lineTo(21.63f, 3.63f)
                lineTo(23.0f, 3.0f)
                lineTo(21.63f, 2.37f)
                lineTo(21.0f, 1.0f)
                lineTo(20.38f, 2.37f)
                lineTo(19.0f, 3.0f)
                lineTo(20.38f, 3.63f)
                lineTo(21.0f, 5.0f)
                moveTo(21.0f, 9.0f)
                lineTo(20.38f, 10.37f)
                lineTo(19.0f, 11.0f)
                lineTo(20.38f, 11.63f)
                lineTo(21.0f, 13.0f)
                lineTo(21.63f, 11.63f)
                lineTo(23.0f, 11.0f)
                lineTo(21.63f, 10.37f)
                lineTo(21.0f, 9.0f)
                close()
            }
        }
        .build()
        return _magicStaff!!
    }

private var _magicStaff: ImageVector? = null
