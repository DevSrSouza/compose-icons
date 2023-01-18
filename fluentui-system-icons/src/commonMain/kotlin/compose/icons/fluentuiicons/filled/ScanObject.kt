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

public val FilledGroup.ScanObject: ImageVector
    get() {
        if (_scanObject != null) {
            return _scanObject!!
        }
        _scanObject = Builder(name = "ScanObject", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 5.25f)
                curveTo(3.5f, 4.2835f, 4.2835f, 3.5f, 5.25f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(8.6642f, 3.5f, 9.0f, 3.1642f, 9.0f, 2.75f)
                curveTo(9.0f, 2.3358f, 8.6642f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                verticalLineTo(8.25f)
                curveTo(2.0f, 8.6642f, 2.3358f, 9.0f, 2.75f, 9.0f)
                curveTo(3.1642f, 9.0f, 3.5f, 8.6642f, 3.5f, 8.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(20.5f, 5.25f)
                curveTo(20.5f, 4.2835f, 19.7165f, 3.5f, 18.75f, 3.5f)
                horizontalLineTo(15.75f)
                curveTo(15.3358f, 3.5f, 15.0f, 3.1642f, 15.0f, 2.75f)
                curveTo(15.0f, 2.3358f, 15.3358f, 2.0f, 15.75f, 2.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 2.0f, 22.0f, 3.4551f, 22.0f, 5.25f)
                verticalLineTo(8.25f)
                curveTo(22.0f, 8.6642f, 21.6642f, 9.0f, 21.25f, 9.0f)
                curveTo(20.8358f, 9.0f, 20.5f, 8.6642f, 20.5f, 8.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(5.25f, 20.5f)
                curveTo(4.2835f, 20.5f, 3.5f, 19.7165f, 3.5f, 18.75f)
                verticalLineTo(15.75f)
                curveTo(3.5f, 15.3358f, 3.1642f, 15.0f, 2.75f, 15.0f)
                curveTo(2.3358f, 15.0f, 2.0f, 15.3358f, 2.0f, 15.75f)
                verticalLineTo(18.75f)
                curveTo(2.0f, 20.5449f, 3.4551f, 22.0f, 5.25f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(8.6642f, 22.0f, 9.0f, 21.6642f, 9.0f, 21.25f)
                curveTo(9.0f, 20.8358f, 8.6642f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(20.5f, 18.75f)
                curveTo(20.5f, 19.7165f, 19.7165f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(15.3358f, 20.5f, 15.0f, 20.8358f, 15.0f, 21.25f)
                curveTo(15.0f, 21.6642f, 15.3358f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 22.0f, 22.0f, 20.5449f, 22.0f, 18.75f)
                verticalLineTo(15.75f)
                curveTo(22.0f, 15.3358f, 21.6642f, 15.0f, 21.25f, 15.0f)
                curveTo(20.8358f, 15.0f, 20.5f, 15.3358f, 20.5f, 15.75f)
                verticalLineTo(18.75f)
                close()
                moveTo(13.8197f, 8.2269f)
                curveTo(12.9211f, 6.9914f, 11.0789f, 6.9914f, 10.1804f, 8.2269f)
                lineTo(7.126f, 12.4266f)
                curveTo(6.0444f, 13.9138f, 7.1068f, 16.0f, 8.9457f, 16.0f)
                horizontalLineTo(15.0544f)
                curveTo(16.8932f, 16.0f, 17.9556f, 13.9138f, 16.874f, 12.4266f)
                lineTo(13.8197f, 8.2269f)
                close()
            }
        }
        .build()
        return _scanObject!!
    }

private var _scanObject: ImageVector? = null
