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

public val TablerIcons.ParachuteOff: ImageVector
    get() {
        if (_parachuteOff != null) {
            return _parachuteOff!!
        }
        _parachuteOff = Builder(name = "ParachuteOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -5.523f, -4.477f, -10.0f, -10.0f, -10.0f)
                curveToRelative(-1.737f, 0.0f, -3.37f, 0.443f, -4.794f, 1.222f)
                moveToRelative(-2.28f, 1.71f)
                arcToRelative(9.969f, 9.969f, 0.0f, false, false, -2.926f, 7.068f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveToRelative(0.0f, -1.66f, -1.46f, -3.0f, -3.25f, -3.0f)
                curveToRelative(-1.63f, 0.0f, -2.973f, 1.099f, -3.212f, 2.54f)
                moveToRelative(-0.097f, -0.09f)
                curveToRelative(-0.23f, -1.067f, -1.12f, -1.935f, -2.29f, -2.284f)
                moveToRelative(-3.445f, 0.568f)
                curveToRelative(-0.739f, 0.55f, -1.206f, 1.36f, -1.206f, 2.266f)
                curveToRelative(0.0f, -1.66f, -1.46f, -3.0f, -3.25f, -3.0f)
                curveToRelative(-1.8f, 0.0f, -3.25f, 1.34f, -3.25f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                lineToRelative(10.0f, 10.0f)
                lineToRelative(-3.5f, -10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.582f, 14.624f)
                lineToRelative(-2.582f, 7.376f)
                lineToRelative(4.992f, -4.992f)
                moveToRelative(2.014f, -2.014f)
                lineToRelative(3.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _parachuteOff!!
    }

private var _parachuteOff: ImageVector? = null
