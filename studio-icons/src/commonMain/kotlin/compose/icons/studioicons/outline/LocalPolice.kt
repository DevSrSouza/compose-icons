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

public val OutlineGroup.LocalPolice: ImageVector
    get() {
        if (_localPolice != null) {
            return _localPolice!!
        }
        _localPolice = Builder(name = "LocalPolice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 12.59f)
                lineToRelative(0.9f, 3.88f)
                lineTo(12.0f, 14.42f)
                lineToRelative(-3.4f, 2.05f)
                lineToRelative(0.9f, -3.87f)
                lineToRelative(-3.0f, -2.59f)
                lineToRelative(3.96f, -0.34f)
                lineTo(12.0f, 6.02f)
                lineToRelative(1.54f, 3.64f)
                lineTo(17.5f, 10.0f)
                lineTo(14.5f, 12.59f)
                close()
                moveTo(12.0f, 3.19f)
                lineToRelative(7.0f, 3.11f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 4.52f, -2.98f, 8.69f, -7.0f, 9.93f)
                curveTo(7.98f, 19.69f, 5.0f, 15.52f, 5.0f, 11.0f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.19f)
                moveTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f)
                curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _localPolice!!
    }

private var _localPolice: ImageVector? = null
