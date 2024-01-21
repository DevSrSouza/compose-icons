package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.DeleteLeft: ImageVector
    get() {
        if (_deleteLeft != null) {
            return _deleteLeft!!
        }
        _deleteLeft = Builder(name = "DeleteLeft", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.0f, 128.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(205.3f)
                curveToRelative(-17.0f, 0.0f, -33.3f, 6.7f, -45.3f, 18.7f)
                lineTo(9.4f, 233.4f)
                curveToRelative(-6.0f, 6.0f, -9.4f, 14.1f, -9.4f, 22.6f)
                reflectiveCurveToRelative(3.4f, 16.6f, 9.4f, 22.6f)
                lineTo(160.0f, 429.3f)
                curveToRelative(12.0f, 12.0f, 28.3f, 18.7f, 45.3f, 18.7f)
                horizontalLineTo(512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(128.0f)
                close()
                moveTo(271.0f, 175.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(47.0f, 47.0f)
                lineToRelative(47.0f, -47.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-47.0f, 47.0f)
                lineToRelative(47.0f, 47.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-47.0f, -47.0f)
                lineToRelative(-47.0f, 47.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(47.0f, -47.0f)
                lineToRelative(-47.0f, -47.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                close()
            }
        }
        .build()
        return _deleteLeft!!
    }

private var _deleteLeft: ImageVector? = null
