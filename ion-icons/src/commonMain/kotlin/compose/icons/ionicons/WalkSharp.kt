package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.WalkSharp: ImageVector
    get() {
        if (_walkSharp != null) {
            return _walkSharp!!
        }
        _walkSharp = Builder(name = "WalkSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(315.09f, 481.38f)
                lineTo(258.14f, 366.26f)
                lineToRelative(-45.0f, -57.56f)
                arcToRelative(73.11f, 73.11f, 0.0f, false, true, -10.16f, -37.17f)
                verticalLineTo(142.0f)
                horizontalLineToRelative(15.73f)
                arcTo(40.36f, 40.36f, 0.0f, false, true, 259.0f, 182.32f)
                verticalLineTo(344.84f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.18f, 291.5f)
                lineToRelative(0.0f, -74.77f)
                lineToRelative(64.95f, -65.1f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(376.35f, 295.73f)
                lineToRelative(-83.95f, -56.38f)
                lineToRelative(0.0f, -44.68f)
                lineToRelative(104.68f, 72.95f)
                lineToRelative(-20.73f, 28.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.13f, 498.58f)
                lineToRelative(-21.43f, -26.91f)
                lineToRelative(80.33f, -81.54f)
                lineToRelative(15.53f, 32.07f)
                lineToRelative(-74.43f, 76.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 16.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(259.02f, 67.21f)
                moveToRelative(-37.38f, 0.0f)
                arcToRelative(37.38f, 37.38f, 0.0f, true, true, 74.76f, 0.0f)
                arcToRelative(37.38f, 37.38f, 0.0f, true, true, -74.76f, 0.0f)
            }
        }
        .build()
        return _walkSharp!!
    }

private var _walkSharp: ImageVector? = null
