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

public val TablerIcons.UfoOff: ImageVector
    get() {
        if (_ufoOff != null) {
            return _ufoOff!!
        }
        _ufoOff = Builder(name = "UfoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.95f, 9.01f)
                curveToRelative(3.02f, 0.739f, 5.05f, 2.123f, 5.05f, 3.714f)
                curveToRelative(0.0f, 1.08f, -0.931f, 2.063f, -2.468f, 2.814f)
                moveToRelative(-3.0f, 1.0f)
                curveToRelative(-1.36f, 0.295f, -2.9f, 0.462f, -4.531f, 0.462f)
                curveToRelative(-5.52f, 0.0f, -10.0f, -1.909f, -10.0f, -4.276f)
                curveToRelative(0.0f, -1.59f, 2.04f, -2.985f, 5.07f, -3.724f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.69f, 10.686f)
                curveToRelative(1.388f, -0.355f, 2.31f, -0.976f, 2.31f, -1.686f)
                verticalLineToRelative(-0.035f)
                curveToRelative(0.0f, -2.742f, -2.239f, -4.965f, -5.0f, -4.965f)
                curveToRelative(-1.125f, 0.0f, -2.164f, 0.37f, -3.0f, 0.992f)
                moveToRelative(-1.707f, 2.297f)
                arcToRelative(4.925f, 4.925f, 0.0f, false, false, -0.293f, 1.676f)
                verticalLineToRelative(0.035f)
                curveToRelative(0.0f, 0.961f, 1.696f, 1.764f, 3.956f, 1.956f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 17.0f)
                lineToRelative(2.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.5f, 17.0f)
                lineToRelative(-1.5f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 13.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _ufoOff!!
    }

private var _ufoOff: ImageVector? = null
