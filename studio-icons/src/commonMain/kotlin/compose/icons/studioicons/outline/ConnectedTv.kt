package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.ConnectedTv: ImageVector
    get() {
        if (_connectedTv != null) {
            return _connectedTv!!
        }
        _connectedTv = Builder(name = "ConnectedTv", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f)
                lineTo(22.0f, 5.0f)
                curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(5.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                curveTo(7.0f, 14.89f, 6.11f, 14.0f, 5.0f, 14.0f)
                close()
                moveTo(5.0f, 11.0f)
                verticalLineToRelative(1.43f)
                curveToRelative(1.97f, 0.0f, 3.57f, 1.6f, 3.57f, 3.57f)
                horizontalLineTo(10.0f)
                curveTo(10.0f, 13.24f, 7.76f, 11.0f, 5.0f, 11.0f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineToRelative(1.45f)
                curveToRelative(3.61f, 0.0f, 6.55f, 2.93f, 6.55f, 6.55f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 11.58f, 9.41f, 8.0f, 5.0f, 8.0f)
                close()
            }
        }
        .build()
        return _connectedTv!!
    }

private var _connectedTv: ImageVector? = null
