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

public val FilledGroup.PanelRightContract: ImageVector
    get() {
        if (_panelRightContract != null) {
            return _panelRightContract!!
        }
        _panelRightContract = Builder(name = "PanelRightContract", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1925f, 9.2483f)
                curveTo(9.4696f, 8.9404f, 9.9438f, 8.9154f, 10.2517f, 9.1925f)
                lineTo(12.7517f, 11.4425f)
                curveTo(12.9098f, 11.5847f, 13.0f, 11.7874f, 13.0f, 12.0f)
                curveTo(13.0f, 12.2126f, 12.9098f, 12.4152f, 12.7517f, 12.5575f)
                lineTo(10.2517f, 14.8075f)
                curveTo(9.9438f, 15.0846f, 9.4696f, 15.0596f, 9.1925f, 14.7517f)
                curveTo(8.9154f, 14.4438f, 8.9404f, 13.9696f, 9.2483f, 13.6925f)
                lineTo(10.2955f, 12.75f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 12.75f, 6.0f, 12.4142f, 6.0f, 12.0f)
                curveTo(6.0f, 11.5858f, 6.3358f, 11.25f, 6.75f, 11.25f)
                horizontalLineTo(10.2955f)
                lineTo(9.2483f, 10.3075f)
                curveTo(8.9404f, 10.0304f, 8.9154f, 9.5562f, 9.1925f, 9.2483f)
                close()
                moveTo(22.0f, 17.25f)
                curveTo(22.0f, 18.7688f, 20.7688f, 20.0f, 19.25f, 20.0f)
                lineTo(4.75f, 20.0f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                lineTo(22.0f, 17.25f)
                close()
                moveTo(15.0017f, 18.5f)
                lineTo(15.0017f, 5.5f)
                lineTo(4.75f, 5.5f)
                curveTo(4.0596f, 5.5f, 3.5f, 6.0596f, 3.5f, 6.75f)
                lineTo(3.5f, 17.25f)
                curveTo(3.5f, 17.9404f, 4.0596f, 18.5f, 4.75f, 18.5f)
                lineTo(15.0017f, 18.5f)
                close()
            }
        }
        .build()
        return _panelRightContract!!
    }

private var _panelRightContract: ImageVector? = null
