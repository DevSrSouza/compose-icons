package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.BreakoutRoom: ImageVector
    get() {
        if (_breakoutRoom != null) {
            return _breakoutRoom!!
        }
        _breakoutRoom = Builder(name = "BreakoutRoom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(14.2141f)
                curveTo(14.6196f, 20.568f, 14.9451f, 20.0601f, 15.1672f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 19.5f, 19.5f, 18.7165f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(8.8328f)
                curveTo(3.9399f, 9.0549f, 3.432f, 9.3804f, 3.0f, 9.7859f)
                verticalLineTo(6.25f)
                close()
                moveTo(13.4891f, 19.5f)
                curveTo(12.9116f, 20.4021f, 11.9006f, 21.0f, 10.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(13.25f)
                curveTo(3.0f, 12.0994f, 3.5979f, 11.0884f, 4.5f, 10.5109f)
                curveTo(5.0051f, 10.1875f, 5.6057f, 10.0f, 6.25f, 10.0f)
                horizontalLineTo(10.75f)
                curveTo(12.5449f, 10.0f, 14.0f, 11.4551f, 14.0f, 13.25f)
                verticalLineTo(17.75f)
                curveTo(14.0f, 18.3943f, 13.8125f, 18.9949f, 13.4891f, 19.5f)
                close()
                moveTo(4.5f, 13.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(10.75f)
                curveTo(11.7165f, 19.5f, 12.5f, 18.7165f, 12.5f, 17.75f)
                verticalLineTo(13.25f)
                curveTo(12.5f, 12.2835f, 11.7165f, 11.5f, 10.75f, 11.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 11.5f, 4.5f, 12.2835f, 4.5f, 13.25f)
                close()
            }
        }
        .build()
        return _breakoutRoom!!
    }

private var _breakoutRoom: ImageVector? = null
