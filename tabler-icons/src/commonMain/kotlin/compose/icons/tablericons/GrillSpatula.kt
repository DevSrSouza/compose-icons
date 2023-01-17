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

public val TablerIcons.GrillSpatula: ImageVector
    get() {
        if (_grillSpatula != null) {
            return _grillSpatula!!
        }
        _grillSpatula = Builder(name = "GrillSpatula", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.2f, 10.2f)
                lineToRelative(6.3f, 6.3f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.347f, 16.575f)
                lineToRelative(1.08f, 1.079f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, -2.773f, 2.772f)
                lineToRelative(-1.08f, -1.079f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, 2.773f, -2.772f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                lineToRelative(3.05f, 3.15f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, false, 4.1f, -4.1f)
                lineToRelative(-3.15f, -3.05f)
                lineToRelative(-4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _grillSpatula!!
    }

private var _grillSpatula: ImageVector? = null
