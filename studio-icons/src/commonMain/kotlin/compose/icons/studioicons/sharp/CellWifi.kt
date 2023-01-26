package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.CellWifi: ImageVector
    get() {
        if (_cellWifi != null) {
            return _cellWifi!!
        }
        _cellWifi = Builder(name = "CellWifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 22.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(5.97f)
                lineTo(6.0f, 22.0f)
                close()
                moveTo(20.0f, 20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.22f)
                lineToRelative(2.0f, -2.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(5.22f, 7.22f)
                lineTo(3.93f, 5.93f)
                curveToRelative(3.9f, -3.91f, 10.24f, -3.91f, 14.15f, 0.0f)
                lineToRelative(-1.29f, 1.29f)
                curveTo(13.6f, 4.03f, 8.41f, 4.03f, 5.22f, 7.22f)
                close()
                moveTo(12.93f, 11.07f)
                lineTo(11.0f, 13.0f)
                lineToRelative(-1.93f, -1.93f)
                curveTo(10.14f, 10.01f, 11.86f, 10.01f, 12.93f, 11.07f)
                close()
                moveTo(14.22f, 9.79f)
                curveToRelative(-1.78f, -1.77f, -4.66f, -1.77f, -6.43f, 0.0f)
                lineTo(6.5f, 8.5f)
                curveToRelative(2.48f, -2.48f, 6.52f, -2.48f, 9.0f, 0.0f)
                lineTo(14.22f, 9.79f)
                close()
            }
        }
        .build()
        return _cellWifi!!
    }

private var _cellWifi: ImageVector? = null
