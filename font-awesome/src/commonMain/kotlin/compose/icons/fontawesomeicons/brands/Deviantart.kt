package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Deviantart: ImageVector
    get() {
        if (_deviantart != null) {
            return _deviantart!!
        }
        _deviantart = Builder(name = "Deviantart", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 93.2f)
                lineToRelative(-98.2f, 179.1f)
                lineToRelative(7.4f, 9.5f)
                horizontalLineTo(320.0f)
                verticalLineToRelative(127.7f)
                horizontalLineTo(159.1f)
                lineToRelative(-13.5f, 9.2f)
                lineToRelative(-43.7f, 84.0f)
                curveToRelative(-0.3f, 0.0f, -8.6f, 8.6f, -9.2f, 9.2f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(-93.2f)
                lineToRelative(93.2f, -179.4f)
                lineToRelative(-7.4f, -9.2f)
                horizontalLineTo(0.0f)
                verticalLineTo(102.5f)
                horizontalLineToRelative(156.0f)
                lineToRelative(13.5f, -9.2f)
                lineToRelative(43.7f, -84.0f)
                curveToRelative(0.3f, 0.0f, 8.6f, -8.6f, 9.2f, -9.2f)
                horizontalLineTo(320.0f)
                verticalLineToRelative(93.1f)
                close()
            }
        }
        .build()
        return _deviantart!!
    }

private var _deviantart: ImageVector? = null
