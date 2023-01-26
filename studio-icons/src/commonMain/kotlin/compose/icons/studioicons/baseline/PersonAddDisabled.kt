package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PersonAddDisabled: ImageVector
    get() {
        if (_personAddDisabled != null) {
            return _personAddDisabled!!
        }
        _personAddDisabled = Builder(name = "PersonAddDisabled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.3f, -4.1f, -3.7f, -6.9f, -3.9f)
                lineToRelative(6.0f, 5.9f)
                horizontalLineToRelative(0.9f)
                close()
                moveTo(11.4f, 14.5f)
                curveTo(9.2f, 15.1f, 7.0f, 16.3f, 7.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.9f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(1.3f, -1.3f)
                lineToRelative(-21.0f, -20.9f)
                lineTo(0.0f, 3.1f)
                lineToRelative(4.0f, 4.0f)
                lineTo(4.0f, 10.0f)
                lineTo(1.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.9f)
                lineToRelative(2.5f, 2.5f)
                close()
                moveTo(6.0f, 10.0f)
                verticalLineToRelative(-0.9f)
                lineToRelative(0.9f, 0.9f)
                lineTo(6.0f, 10.0f)
                close()
            }
        }
        .build()
        return _personAddDisabled!!
    }

private var _personAddDisabled: ImageVector? = null
