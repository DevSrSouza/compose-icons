package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.GhostFilled: ImageVector
    get() {
        if (_ghostFilled != null) {
            return _ghostFilled!!
        }
        _ghostFilled = Builder(name = "GhostFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.996f, 7.75f)
                lineToRelative(0.004f, 0.25f)
                lineToRelative(-0.001f, 6.954f)
                lineToRelative(0.01f, 0.103f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, true, -1.468f, 2.618f)
                lineToRelative(-0.163f, 0.08f)
                curveToRelative(-1.053f, 0.475f, -2.283f, 0.248f, -3.129f, -0.593f)
                lineToRelative(-0.137f, -0.146f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -1.024f, 0.0f)
                arcToRelative(2.65f, 2.65f, 0.0f, false, true, -4.176f, 0.0f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.512f, -0.25f)
                curveToRelative(-0.2f, 0.0f, -0.389f, 0.092f, -0.55f, 0.296f)
                arcToRelative(2.78f, 2.78f, 0.0f, false, true, -4.859f, -2.005f)
                lineToRelative(0.008f, -0.091f)
                lineToRelative(0.001f, -6.966f)
                lineToRelative(0.004f, -0.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.996f, -7.75f)
                close()
                moveTo(14.82f, 13.429f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.391f, -0.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.858f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.142f, 1.642f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 5.142f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.25f, -1.392f)
                close()
                moveTo(10.01f, 9.0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, -1.993f)
                close()
                moveTo(14.01f, 9.0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, -1.993f)
                close()
            }
        }
        .build()
        return _ghostFilled!!
    }

private var _ghostFilled: ImageVector? = null
