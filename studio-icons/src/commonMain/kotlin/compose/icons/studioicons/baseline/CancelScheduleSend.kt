package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.CancelScheduleSend: ImageVector
    get() {
        if (_cancelScheduleSend != null) {
            return _cancelScheduleSend!!
        }
        _cancelScheduleSend = Builder(name = "CancelScheduleSend", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 9.0f)
                curveToRelative(-0.42f, 0.0f, -0.83f, 0.04f, -1.24f, 0.11f)
                lineTo(1.01f, 3.0f)
                lineTo(1.0f, 10.0f)
                lineToRelative(9.0f, 2.0f)
                lineToRelative(-9.0f, 2.0f)
                lineToRelative(0.01f, 7.0f)
                lineToRelative(8.07f, -3.46f)
                curveTo(9.59f, 21.19f, 12.71f, 24.0f, 16.5f, 24.0f)
                curveToRelative(4.14f, 0.0f, 7.5f, -3.36f, 7.5f, -7.5f)
                reflectiveCurveTo(20.64f, 9.0f, 16.5f, 9.0f)
                close()
                moveTo(16.5f, 22.0f)
                curveToRelative(-3.03f, 0.0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveTo(19.53f, 22.0f, 16.5f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.27f, 14.03f)
                lineToRelative(-1.77f, 1.76f)
                lineToRelative(-1.77f, -1.76f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(1.76f, 1.77f)
                lineToRelative(-1.76f, 1.77f)
                lineToRelative(0.7f, 0.7f)
                lineToRelative(1.77f, -1.76f)
                lineToRelative(1.77f, 1.76f)
                lineToRelative(0.7f, -0.7f)
                lineToRelative(-1.76f, -1.77f)
                lineToRelative(1.76f, -1.77f)
                close()
            }
        }
        .build()
        return _cancelScheduleSend!!
    }

private var _cancelScheduleSend: ImageVector? = null
