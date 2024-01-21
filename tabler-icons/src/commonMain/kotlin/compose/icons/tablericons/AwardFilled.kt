package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.AwardFilled: ImageVector
    get() {
        if (_awardFilled != null) {
            return _awardFilled!!
        }
        _awardFilled = Builder(name = "AwardFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.496f, 13.983f)
                lineToRelative(1.966f, 3.406f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, -0.705f, 1.488f)
                lineToRelative(-0.113f, 0.011f)
                lineToRelative(-0.112f, -0.001f)
                lineToRelative(-2.933f, -0.19f)
                lineToRelative(-1.303f, 2.636f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, -1.608f, 0.26f)
                lineToRelative(-0.082f, -0.094f)
                lineToRelative(-0.072f, -0.11f)
                lineToRelative(-1.968f, -3.407f)
                arcToRelative(8.994f, 8.994f, 0.0f, false, false, 6.93f, -3.999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.43f, 17.982f)
                lineToRelative(-1.966f, 3.408f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, -1.622f, 0.157f)
                lineToRelative(-0.076f, -0.1f)
                lineToRelative(-0.064f, -0.114f)
                lineToRelative(-1.304f, -2.635f)
                lineToRelative(-2.931f, 0.19f)
                arcToRelative(1.001f, 1.001f, 0.0f, false, true, -1.022f, -1.29f)
                lineToRelative(0.04f, -0.107f)
                lineToRelative(0.05f, -0.1f)
                lineToRelative(1.968f, -3.409f)
                arcToRelative(8.994f, 8.994f, 0.0f, false, false, 6.927f, 4.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(0.24f, 0.004f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 6.76f, 6.996f)
                lineToRelative(-0.003f, 0.193f)
                lineToRelative(-0.007f, 0.192f)
                lineToRelative(-0.018f, 0.245f)
                lineToRelative(-0.026f, 0.242f)
                lineToRelative(-0.024f, 0.178f)
                arcToRelative(6.985f, 6.985f, 0.0f, false, true, -0.317f, 1.268f)
                lineToRelative(-0.116f, 0.308f)
                lineToRelative(-0.153f, 0.348f)
                arcToRelative(7.001f, 7.001f, 0.0f, false, true, -12.688f, -0.028f)
                lineToRelative(-0.13f, -0.297f)
                lineToRelative(-0.052f, -0.133f)
                lineToRelative(-0.08f, -0.217f)
                lineToRelative(-0.095f, -0.294f)
                arcToRelative(6.96f, 6.96f, 0.0f, false, true, -0.093f, -0.344f)
                lineToRelative(-0.06f, -0.271f)
                lineToRelative(-0.049f, -0.271f)
                lineToRelative(-0.02f, -0.139f)
                lineToRelative(-0.039f, -0.323f)
                lineToRelative(-0.024f, -0.365f)
                lineToRelative(-0.006f, -0.292f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 6.76f, -6.996f)
                lineToRelative(0.24f, -0.004f)
                close()
            }
        }
        .build()
        return _awardFilled!!
    }

private var _awardFilled: ImageVector? = null
