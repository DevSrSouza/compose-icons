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

public val TablerIcons.BoneOff: ImageVector
    get() {
        if (_boneOff != null) {
            return _boneOff!!
        }
        _boneOff = Builder(name = "BoneOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 8.502f)
                lineToRelative(0.38f, -0.38f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 5.12f, -2.122f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.12f, 5.122f)
                lineToRelative(-0.372f, 0.372f)
                moveToRelative(-2.008f, 2.008f)
                lineToRelative(-2.378f, 2.378f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -5.117f, 2.297f)
                lineToRelative(0.0f, -0.177f)
                lineToRelative(-0.176f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 2.298f, -5.115f)
                lineToRelative(2.378f, -2.378f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _boneOff!!
    }

private var _boneOff: ImageVector? = null
