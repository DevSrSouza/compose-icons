package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.LegendToggle: ImageVector
    get() {
        if (_legendToggle != null) {
            return _legendToggle!!
        }
        _legendToggle = Builder(name = "LegendToggle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(20.0f, 14.55f, 19.55f, 15.0f, 19.0f, 15.0f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineTo(5.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveTo(20.0f, 17.45f, 19.55f, 17.0f, 19.0f, 17.0f)
                close()
                moveTo(15.0f, 11.0f)
                lineToRelative(4.58f, -3.25f)
                curveTo(19.84f, 7.56f, 20.0f, 7.26f, 20.0f, 6.94f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.81f, -0.92f, -1.29f, -1.58f, -0.82f)
                lineTo(15.0f, 8.55f)
                lineTo(10.0f, 5.0f)
                lineTo(4.48f, 8.36f)
                curveTo(4.18f, 8.55f, 4.0f, 8.87f, 4.0f, 9.22f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.78f, 0.85f, 1.26f, 1.52f, 0.85f)
                lineToRelative(4.4f, -2.68f)
                lineTo(15.0f, 11.0f)
                close()
            }
        }
        .build()
        return _legendToggle!!
    }

private var _legendToggle: ImageVector? = null
