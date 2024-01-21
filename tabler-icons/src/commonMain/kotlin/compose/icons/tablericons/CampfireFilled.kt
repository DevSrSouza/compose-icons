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

public val TablerIcons.CampfireFilled: ImageVector
    get() {
        if (_campfireFilled != null) {
            return _campfireFilled!!
        }
        _campfireFilled = Builder(name = "CampfireFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.757f, 16.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.597f, 1.905f)
                lineToRelative(-0.111f, 0.035f)
                lineToRelative(-16.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.597f, -1.905f)
                lineToRelative(0.111f, -0.035f)
                lineToRelative(16.0f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.03f, 16.757f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.098f, -0.749f)
                lineToRelative(0.115f, 0.022f)
                lineToRelative(16.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.37f, 1.962f)
                lineToRelative(-0.116f, -0.022f)
                lineToRelative(-16.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.727f, -1.213f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.553f, 2.106f)
                curveToRelative(-4.174f, 2.086f, -6.553f, 5.358f, -6.553f, 8.894f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                curveToRelative(0.0f, -1.047f, -0.188f, -1.808f, -0.606f, -2.705f)
                lineToRelative(-0.169f, -0.345f)
                lineToRelative(-0.33f, -0.647f)
                curveToRelative(-0.621f, -1.24f, -0.895f, -2.338f, -0.895f, -4.303f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.447f, -0.894f)
                close()
            }
        }
        .build()
        return _campfireFilled!!
    }

private var _campfireFilled: ImageVector? = null
