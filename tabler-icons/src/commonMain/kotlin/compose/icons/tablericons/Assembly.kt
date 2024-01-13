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

public val TablerIcons.Assembly: ImageVector
    get() {
        if (_assembly != null) {
            return _assembly!!
        }
        _assembly = Builder(name = "Assembly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.875f, 6.27f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, 1.125f, 1.948f)
                verticalLineToRelative(7.284f)
                curveToRelative(0.0f, 0.809f, -0.443f, 1.555f, -1.158f, 1.948f)
                lineToRelative(-6.75f, 4.27f)
                arcToRelative(2.269f, 2.269f, 0.0f, false, true, -2.184f, 0.0f)
                lineToRelative(-6.75f, -4.27f)
                arcToRelative(2.225f, 2.225f, 0.0f, false, true, -1.158f, -1.948f)
                verticalLineToRelative(-7.285f)
                curveToRelative(0.0f, -0.809f, 0.443f, -1.554f, 1.158f, -1.947f)
                lineToRelative(6.75f, -3.98f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, 2.25f, 0.0f)
                lineToRelative(6.75f, 3.98f)
                horizontalLineToRelative(-0.033f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 9.422f)
                curveToRelative(0.312f, 0.18f, 0.503f, 0.515f, 0.5f, 0.876f)
                verticalLineToRelative(3.277f)
                curveToRelative(0.0f, 0.364f, -0.197f, 0.7f, -0.515f, 0.877f)
                lineToRelative(-3.0f, 1.922f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.97f, 0.0f)
                lineToRelative(-3.0f, -1.922f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.515f, -0.876f)
                verticalLineToRelative(-3.278f)
                curveToRelative(0.0f, -0.364f, 0.197f, -0.7f, 0.514f, -0.877f)
                lineToRelative(3.0f, -1.79f)
                curveToRelative(0.311f, -0.174f, 0.69f, -0.174f, 1.0f, 0.0f)
                lineToRelative(3.0f, 1.79f)
                horizontalLineToRelative(-0.014f)
                close()
            }
        }
        .build()
        return _assembly!!
    }

private var _assembly: ImageVector? = null
