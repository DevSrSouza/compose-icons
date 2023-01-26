package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AdUnits: ImageVector
    get() {
        if (_adUnits != null) {
            return _adUnits!!
        }
        _adUnits = Builder(name = "AdUnits", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 1.9f, 18.1f, 1.0f, 17.0f, 1.0f)
                lineTo(17.0f, 1.0f)
                close()
                moveTo(7.0f, 4.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(7.0f)
                lineTo(7.0f, 18.0f)
                close()
                moveTo(7.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.0f)
                lineTo(7.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _adUnits!!
    }

private var _adUnits: ImageVector? = null
