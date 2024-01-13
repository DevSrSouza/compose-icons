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

public val TablerIcons.MasksTheaterOff: ImageVector
    get() {
        if (_masksTheaterOff != null) {
            return _masksTheaterOff!!
        }
        _masksTheaterOff = Builder(name = "MasksTheaterOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                curveToRelative(0.058f, 0.0f, 0.133f, 0.0f, 0.192f, 0.0f)
                horizontalLineToRelative(6.616f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.992f, 2.183f)
                lineToRelative(-0.554f, 6.041f)
                moveToRelative(-1.286f, 2.718f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, true, -2.71f, 1.058f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.983f, -3.635f)
                lineToRelative(-0.567f, -6.182f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 16.5f)
                curveToRelative(0.657f, 0.438f, 1.313f, 0.588f, 1.97f, 0.451f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.632f, 15.982f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, -0.382f, 0.018f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.983f, -3.635f)
                lineToRelative(-0.567f, -6.182f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.514f, -1.531f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, true, 1.286f, -0.652f)
                moveToRelative(4.0f, 0.0f)
                horizontalLineToRelative(2.808f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveToRelative(0.764f, -0.51f, 1.528f, -0.63f, 2.291f, -0.36f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _masksTheaterOff!!
    }

private var _masksTheaterOff: ImageVector? = null
