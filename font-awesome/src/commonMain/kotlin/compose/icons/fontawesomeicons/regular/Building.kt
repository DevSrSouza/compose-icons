package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Building: ImageVector
    get() {
        if (_building != null) {
            return _building!!
        }
        _building = Builder(name = "Building", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 104.0f)
                curveTo(88.0f, 95.16f, 95.16f, 88.0f, 104.0f, 88.0f)
                horizontalLineTo(152.0f)
                curveTo(160.8f, 88.0f, 168.0f, 95.16f, 168.0f, 104.0f)
                verticalLineTo(152.0f)
                curveTo(168.0f, 160.8f, 160.8f, 168.0f, 152.0f, 168.0f)
                horizontalLineTo(104.0f)
                curveTo(95.16f, 168.0f, 88.0f, 160.8f, 88.0f, 152.0f)
                verticalLineTo(104.0f)
                close()
                moveTo(280.0f, 88.0f)
                curveTo(288.8f, 88.0f, 296.0f, 95.16f, 296.0f, 104.0f)
                verticalLineTo(152.0f)
                curveTo(296.0f, 160.8f, 288.8f, 168.0f, 280.0f, 168.0f)
                horizontalLineTo(232.0f)
                curveTo(223.2f, 168.0f, 216.0f, 160.8f, 216.0f, 152.0f)
                verticalLineTo(104.0f)
                curveTo(216.0f, 95.16f, 223.2f, 88.0f, 232.0f, 88.0f)
                horizontalLineTo(280.0f)
                close()
                moveTo(88.0f, 232.0f)
                curveTo(88.0f, 223.2f, 95.16f, 216.0f, 104.0f, 216.0f)
                horizontalLineTo(152.0f)
                curveTo(160.8f, 216.0f, 168.0f, 223.2f, 168.0f, 232.0f)
                verticalLineTo(280.0f)
                curveTo(168.0f, 288.8f, 160.8f, 296.0f, 152.0f, 296.0f)
                horizontalLineTo(104.0f)
                curveTo(95.16f, 296.0f, 88.0f, 288.8f, 88.0f, 280.0f)
                verticalLineTo(232.0f)
                close()
                moveTo(280.0f, 216.0f)
                curveTo(288.8f, 216.0f, 296.0f, 223.2f, 296.0f, 232.0f)
                verticalLineTo(280.0f)
                curveTo(296.0f, 288.8f, 288.8f, 296.0f, 280.0f, 296.0f)
                horizontalLineTo(232.0f)
                curveTo(223.2f, 296.0f, 216.0f, 288.8f, 216.0f, 280.0f)
                verticalLineTo(232.0f)
                curveTo(216.0f, 223.2f, 223.2f, 216.0f, 232.0f, 216.0f)
                horizontalLineTo(280.0f)
                close()
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.65f, 28.65f, 0.0f, 64.0f, 0.0f)
                horizontalLineTo(320.0f)
                curveTo(355.3f, 0.0f, 384.0f, 28.65f, 384.0f, 64.0f)
                verticalLineTo(448.0f)
                curveTo(384.0f, 483.3f, 355.3f, 512.0f, 320.0f, 512.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 512.0f, 0.0f, 483.3f, 0.0f, 448.0f)
                verticalLineTo(64.0f)
                close()
                moveTo(48.0f, 64.0f)
                verticalLineTo(448.0f)
                curveTo(48.0f, 456.8f, 55.16f, 464.0f, 64.0f, 464.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(400.0f)
                curveTo(144.0f, 373.5f, 165.5f, 352.0f, 192.0f, 352.0f)
                curveTo(218.5f, 352.0f, 240.0f, 373.5f, 240.0f, 400.0f)
                verticalLineTo(464.0f)
                horizontalLineTo(320.0f)
                curveTo(328.8f, 464.0f, 336.0f, 456.8f, 336.0f, 448.0f)
                verticalLineTo(64.0f)
                curveTo(336.0f, 55.16f, 328.8f, 48.0f, 320.0f, 48.0f)
                horizontalLineTo(64.0f)
                curveTo(55.16f, 48.0f, 48.0f, 55.16f, 48.0f, 64.0f)
                close()
            }
        }
        .build()
        return _building!!
    }

private var _building: ImageVector? = null
