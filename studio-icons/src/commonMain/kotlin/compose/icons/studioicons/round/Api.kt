package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Api: ImageVector
    get() {
        if (_api != null) {
            return _api!!
        }
        _api = Builder(name = "Api", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                curveToRelative(-0.56f, 0.56f, -1.45f, 0.56f, -2.0f, 0.01f)
                lineTo(11.0f, 13.0f)
                curveToRelative(-0.55f, -0.55f, -0.55f, -1.44f, 0.0f, -1.99f)
                lineTo(11.0f, 11.0f)
                curveToRelative(0.55f, -0.55f, 1.44f, -0.55f, 1.99f, 0.0f)
                lineTo(13.0f, 11.0f)
                curveTo(13.55f, 11.55f, 13.55f, 12.45f, 13.0f, 13.0f)
                close()
                moveTo(12.0f, 6.0f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(-3.2f, -3.2f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineToRelative(-3.2f, 3.2f)
                lineToRelative(2.5f, 2.5f)
                lineTo(12.0f, 6.0f)
                close()
                moveTo(6.0f, 12.0f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-3.2f, 3.2f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(3.2f, 3.2f)
                lineToRelative(2.5f, -2.5f)
                lineTo(6.0f, 12.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(3.2f, -3.2f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(18.0f, 12.0f)
                close()
                moveTo(12.0f, 18.0f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(3.2f, 3.2f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(3.2f, -3.2f)
                lineToRelative(-2.5f, -2.5f)
                lineTo(12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _api!!
    }

private var _api: ImageVector? = null
