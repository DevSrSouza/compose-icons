package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Api: ImageVector
    get() {
        if (_api != null) {
            return _api!!
        }
        _api = Builder(name = "Api", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(2.0f, -2.0f)
                lineTo(14.0f, 12.0f)
                close()
                moveTo(12.0f, 6.0f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.5f, -2.5f)
                lineTo(12.0f, 1.0f)
                lineTo(7.38f, 5.62f)
                lineToRelative(2.5f, 2.5f)
                lineTo(12.0f, 6.0f)
                close()
                moveTo(6.0f, 12.0f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(1.0f, 12.0f)
                lineToRelative(4.62f, 4.62f)
                lineToRelative(2.5f, -2.5f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.5f, 2.5f)
                lineTo(23.0f, 12.0f)
                lineToRelative(-4.62f, -4.62f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(18.0f, 12.0f)
                close()
                moveTo(12.0f, 18.0f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(12.0f, 23.0f)
                lineToRelative(4.62f, -4.62f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _api!!
    }

private var _api: ImageVector? = null
