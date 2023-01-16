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

public val MaterialDesignIcons.DesktopClassic: ImageVector
    get() {
        if (_desktopClassic != null) {
            return _desktopClassic!!
        }
        _desktopClassic = Builder(name = "DesktopClassic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 13.11f, 4.89f, 14.0f, 6.0f, 14.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 14.0f, 20.0f, 13.11f, 20.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.89f, 19.11f, 2.0f, 18.0f, 2.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                moveTo(4.0f, 15.0f)
                curveTo(2.89f, 15.0f, 2.0f, 15.89f, 2.0f, 17.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.89f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 15.89f, 21.11f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(4.0f)
                moveTo(8.0f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                moveTo(9.0f, 17.75f)
                verticalLineTo(19.25f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.75f)
                horizontalLineTo(9.0f)
                moveTo(15.0f, 17.75f)
                verticalLineTo(19.25f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.75f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _desktopClassic!!
    }

private var _desktopClassic: ImageVector? = null
