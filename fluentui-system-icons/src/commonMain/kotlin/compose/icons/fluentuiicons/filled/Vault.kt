package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Vault: ImageVector
    get() {
        if (_vault != null) {
            return _vault!!
        }
        _vault = Builder(name = "Vault", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.5f)
                curveTo(14.8284f, 13.5f, 15.5f, 12.8284f, 15.5f, 12.0f)
                curveTo(15.5f, 11.1716f, 14.8284f, 10.5f, 14.0f, 10.5f)
                curveTo(13.1716f, 10.5f, 12.5f, 11.1716f, 12.5f, 12.0f)
                curveTo(12.5f, 12.8284f, 13.1716f, 13.5f, 14.0f, 13.5f)
                close()
                moveTo(2.0f, 7.75f)
                curveTo(2.0f, 5.6789f, 3.6789f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(18.25f)
                curveTo(20.3211f, 4.0f, 22.0f, 5.6789f, 22.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(22.0f, 18.3211f, 20.3211f, 20.0f, 18.25f, 20.0f)
                horizontalLineTo(5.75f)
                curveTo(3.6789f, 20.0f, 2.0f, 18.3211f, 2.0f, 16.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(5.75f, 7.0f)
                curveTo(5.3358f, 7.0f, 5.0f, 7.3358f, 5.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(5.0f, 16.6642f, 5.3358f, 17.0f, 5.75f, 17.0f)
                curveTo(6.1642f, 17.0f, 6.5f, 16.6642f, 6.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(6.5f, 7.3358f, 6.1642f, 7.0f, 5.75f, 7.0f)
                close()
                moveTo(11.2803f, 8.2197f)
                curveTo(10.9874f, 7.9268f, 10.5126f, 7.9268f, 10.2197f, 8.2197f)
                curveTo(9.9268f, 8.5126f, 9.9268f, 8.9874f, 10.2197f, 9.2803f)
                lineTo(11.4154f, 10.476f)
                curveTo(11.1514f, 10.9227f, 11.0f, 11.4436f, 11.0f, 12.0f)
                curveTo(11.0f, 12.5564f, 11.1514f, 13.0773f, 11.4154f, 13.524f)
                lineTo(10.2197f, 14.7197f)
                curveTo(9.9268f, 15.0126f, 9.9268f, 15.4874f, 10.2197f, 15.7803f)
                curveTo(10.5126f, 16.0732f, 10.9874f, 16.0732f, 11.2803f, 15.7803f)
                lineTo(12.476f, 14.5846f)
                curveTo(12.9227f, 14.8486f, 13.4436f, 15.0f, 14.0f, 15.0f)
                curveTo(14.5564f, 15.0f, 15.0773f, 14.8486f, 15.524f, 14.5846f)
                lineTo(16.7197f, 15.7803f)
                curveTo(17.0126f, 16.0732f, 17.4874f, 16.0732f, 17.7803f, 15.7803f)
                curveTo(18.0732f, 15.4874f, 18.0732f, 15.0126f, 17.7803f, 14.7197f)
                lineTo(16.5846f, 13.524f)
                curveTo(16.8486f, 13.0773f, 17.0f, 12.5564f, 17.0f, 12.0f)
                curveTo(17.0f, 11.4436f, 16.8486f, 10.9227f, 16.5846f, 10.476f)
                lineTo(17.7803f, 9.2803f)
                curveTo(18.0732f, 8.9874f, 18.0732f, 8.5126f, 17.7803f, 8.2197f)
                curveTo(17.4874f, 7.9268f, 17.0126f, 7.9268f, 16.7197f, 8.2197f)
                lineTo(15.524f, 9.4154f)
                curveTo(15.0773f, 9.1515f, 14.5564f, 9.0f, 14.0f, 9.0f)
                curveTo(13.4436f, 9.0f, 12.9227f, 9.1515f, 12.476f, 9.4154f)
                lineTo(11.2803f, 8.2197f)
                close()
            }
        }
        .build()
        return _vault!!
    }

private var _vault: ImageVector? = null
