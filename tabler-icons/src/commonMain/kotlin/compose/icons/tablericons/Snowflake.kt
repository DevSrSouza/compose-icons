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

public val TablerIcons.Snowflake: ImageVector
    get() {
        if (_snowflake != null) {
            return _snowflake!!
        }
        _snowflake = Builder(name = "Snowflake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                lineToRelative(2.0f, 1.0f)
                lineToRelative(2.0f, -1.0f)
                moveToRelative(-2.0f, -2.0f)
                verticalLineToRelative(6.5f)
                lineToRelative(3.0f, 1.72f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9282f, 6.2679f)
                lineToRelative(0.134f, 2.2321f)
                lineToRelative(1.866f, 1.2321f)
                moveToRelative(0.7321f, -2.7321f)
                lineToRelative(-5.6292f, 3.25f)
                lineToRelative(0.0104f, 3.4581f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.9282f, 14.2679f)
                lineToRelative(-1.866f, 1.2321f)
                lineToRelative(-0.134f, 2.2321f)
                moveToRelative(2.7321f, -0.7321f)
                lineToRelative(-5.6292f, -3.25f)
                lineToRelative(-2.9896f, 1.7381f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-2.0f, 1.0f)
                moveToRelative(2.0f, 2.0f)
                lineToRelative(-0.0f, -6.5f)
                lineToRelative(-3.0f, -1.72f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0718f, 17.732f)
                lineToRelative(-0.134f, -2.2321f)
                lineToRelative(-1.866f, -1.2321f)
                moveToRelative(-0.7321f, 2.7321f)
                lineToRelative(5.6292f, -3.25f)
                lineToRelative(-0.0104f, -3.4581f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0718f, 9.7321f)
                lineToRelative(1.866f, -1.2321f)
                lineToRelative(0.134f, -2.2321f)
                moveToRelative(-2.7321f, 0.7321f)
                lineToRelative(5.6292f, 3.25f)
                lineToRelative(2.9896f, -1.7381f)
            }
        }
        .build()
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
