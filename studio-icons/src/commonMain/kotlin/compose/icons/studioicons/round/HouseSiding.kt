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

public val RoundGroup.HouseSiding: ImageVector
    get() {
        if (_houseSiding != null) {
            return _houseSiding!!
        }
        _houseSiding = Builder(name = "HouseSiding", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.46f, 0.0f, 0.68f, -0.57f, 0.33f, -0.87f)
                lineTo(12.67f, 3.6f)
                curveToRelative(-0.38f, -0.34f, -0.96f, -0.34f, -1.34f, 0.0f)
                lineToRelative(-8.36f, 7.53f)
                curveTo(2.63f, 11.43f, 2.84f, 12.0f, 3.3f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(7.21f, 10.0f)
                horizontalLineToRelative(9.58f)
                lineTo(17.0f, 10.19f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-1.81f)
                lineTo(7.21f, 10.0f)
                close()
                moveTo(14.57f, 8.0f)
                horizontalLineTo(9.43f)
                lineTo(12.0f, 5.69f)
                lineTo(14.57f, 8.0f)
                close()
                moveTo(7.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _houseSiding!!
    }

private var _houseSiding: ImageVector? = null
