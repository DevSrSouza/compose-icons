package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.RealEstateAgent: ImageVector
    get() {
        if (_realEstateAgent != null) {
            return _realEstateAgent!!
        }
        _realEstateAgent = Builder(name = "RealEstateAgent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 22.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(14.0f, 1.5f)
                lineToRelative(-7.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(10.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.5f)
                lineTo(14.0f, 1.5f)
                close()
                moveTo(13.5f, 10.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.5f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(15.5f, 10.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(15.5f, 8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(22.0f, 19.0f)
                lineToRelative(-8.0f, 3.0f)
                lineToRelative(-7.0f, -1.98f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(1.97f)
                lineTo(17.0f, 14.0f)
                lineToRelative(0.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-1.76f, -0.68f)
                lineToRelative(-0.33f, 0.94f)
                lineTo(13.0f, 17.0f)
                horizontalLineToRelative(9.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _realEstateAgent!!
    }

private var _realEstateAgent: ImageVector? = null
